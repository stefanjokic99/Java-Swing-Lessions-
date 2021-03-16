package frame;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrame() 
	{
		this.setTitle("Swing I");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*Za blokiranje prozora*/
		//this.setEnabled(false);
		
		/*
		 * screenSize
		 * java.awt.Toolkit.getDefaultToolkit() 
		 * imamo dosta korisnih stvari u njemu
		 */
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = new Dimension(800, 600);
		
		Point location = new Point((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		
		/*
		 * Postavljanje velicine frame na frameSize i centriranje na sredinu ekrana
		 * sa tim sto setLocationRelativeto(null) ne radi na linuxu
		 * Bounds = zavezati, granica
		 * moze se postaviti lokacija i velicina
		 * moze samo setBounds - sve odjednom
		 * setRelativeTo(null) i velicina... ali ne moze na linuxu
		 */
		//this.setSize(frameSize);
		this.setBounds(location.x, location.y, frameSize.width, frameSize.height);
		//this.setLocationRelativeTo(null);
		//this.setLocation(location);
		
		/*
		 * Iskljucivanje povecavanja ekrana
		 */
		this.setResizable(false);
		this.setResizable(true);
		
		/*
		 * Postavljanje ikonice
		 */
		Image ikonica = java.awt.Toolkit.getDefaultToolkit().getImage("icons/setting.png");
		this.setIconImage(ikonica);
		
		/*
		 * setUndecorated za postavljanje bordera 
		 * da li ce postojati x maximum size ili nece
		 */
		this.setUndecorated(true);
		this.setUndecorated(false);
		
		/*
		 * Maximum prilikom otvaranja
		 */
		this.setExtendedState(MAXIMIZED_BOTH);
		
		/*
		 * Objekat button
		 * postavljanje u button e 
		 * zatim dodavanje na ekran
		 */
		JButton button = new JButton("OK");
		getRootPane().setDefaultButton(button);
		getContentPane().add(button);
		
		/*
		 * prvi korak obezbjedimo sliku 
		 * sliku mozemo srediti pomocu getScaledInstance(smanjivanje, razvlacenje)
		 * drugi korak cursor
		 * pomocu newPoint() postavljamo koji deo nam sluzi za aktivaciju
		 */
		Image cursorImage = java.awt.Toolkit.getDefaultToolkit().getImage("icons/cursor_PNG90.png");
		Cursor customCursor = java.awt.Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(), "Kursor");
		
		this.setCursor(customCursor);
		
		/*
		 * takodje imamo i sistemske cursor e
		 */
		
		//this.setCursor(Cursor.S_RESIZE_CURSOR);
		getContentPane().add(new MainPanel());
		
		this.setVisible(true);
	}
	
	
}
