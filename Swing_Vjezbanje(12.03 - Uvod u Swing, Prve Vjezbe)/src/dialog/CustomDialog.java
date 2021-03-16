package dialog;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CustomDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomDialog(Frame parentFrame) {
			
		this.setVisible(true);
		this.setLocationRelativeTo(parentFrame);
		
		/*
		 * u labelu se moze i slika staviti
		 */
		JLabel labela = new JLabel("Ovo je labela", SwingConstants.CENTER);
		this.getContentPane().add(labela);
		
		this.setSize(300, 200);
		
	}

}
