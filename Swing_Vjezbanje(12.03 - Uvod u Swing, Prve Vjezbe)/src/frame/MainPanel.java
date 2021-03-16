package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		
		this.setBackground(Color.white);
		
		/*
		 * BoxLayout nam postavlja elemente u kom god mi hocemo "redu"
		 */
		//this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		
		/*
		 * postavljanje elemenata u panelu po redovima i kolonama
		 * gledamo vizuelno kako nama najvise odgovara
		 */
		//this.setLayout(new GridLayout(1, 2));
		
		/*
		 *  isto uredjenje u redu samo mozemo postaviti hgap i vgap tj razmak izmedju njih i razmak od vrha panela ?Mislim
		 */
		//this.setLayout(new FlowLayout(FlowLayout.LEADING, 150, 150));
		
		/*
		 * Button postuje velicinu za maximum size
		 */
		JButton button1 = new JButton("Dugme1");
		button1.setAlignmentX(JButton.TOP_ALIGNMENT);
		button1.setPreferredSize(new Dimension(150, 120));
		button1.setMaximumSize(new Dimension(180, 180));
		//this.add(button1);
		
		/*
		 * Box.createGlue()
		 * pravi razmak koji nije fiksni 
		 * prilikom promjenjivanja velicine prozora da ne dodje do poremecaja elemenata
		 */
		//this.add(Box.createGlue());
		
		JButton button2 = new JButton("Dugme2");
		button2.setAlignmentX(JButton.LEFT_ALIGNMENT);
		button2.setPreferredSize(new Dimension(150, 120));
		button2.setMaximumSize(new Dimension(180, 180));
		//this.add(button2);
		
		/*
		 * Box.createHorizontalStrut(int height)
		 * postavlja maksimalni razmak...(?Mislim)
		 */
		this.add(Box.createHorizontalStrut(180));
		
		JButton button3 = new JButton("Dugme3");
		button3.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button3.setPreferredSize(new Dimension(150, 120));
		button3.setMaximumSize(new Dimension(180, 180));
		//this.add(button3);
		//this.add(Box.createGlue());
		
		/*
		 *  -
		 * | |
		 * 	-
		 * elementi se postavljaju u ovom obliku
		 * unosimo hgap i vgap
		 * razmak izmedju elemenata
		 * horizontalni i vertikalni
		 */
		this.setLayout(new BorderLayout(15, 15));
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		this.add(redPanel, BorderLayout.EAST);
		
		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.GRAY);
		this.add(grayPanel, BorderLayout.WEST);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		this.add(bluePanel, BorderLayout.NORTH);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setBackground(Color.PINK);
		this.add(pinkPanel, BorderLayout.SOUTH);
		
		/*
		 * setSize i setLocation nemaju nekog uticaja u ovom slucaju jer zauzima sav zaostali prostor
		 */
		JPanel maliPanel = new JPanel();
		maliPanel.setLocation(150, 150);
		maliPanel.setSize(50, 50);
		maliPanel.setBackground(Color.GREEN);
		this.add(maliPanel);
		
		/*
		 * jedini uticaj imaju setLocation i setSize kada je setLayout(null)
		 * pa podesimo velicinu naseg panela
		 */
		setLayout(null);
		maliPanel.setLocation(120, 120);
		maliPanel.setSize(150,150);
		
		/*
		 * Border moze obicni linijski
		 * isprobati sve ove bordere
		 * bevel border 
		 * moze samo jedan cosak da ofarbamo a drugi da se stapa sa bojom panela
		 * provjeriti kako se radi new ImageIcon
		 * i moze se mix raditi sa titled i u compaundBorderu
		 */
		Border blackLineBorder = BorderFactory.createLineBorder(Color.BLACK, 3);
		Border border = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GREEN);
		Border bevelBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GREEN);
		Border matteBorder = BorderFactory.createMatteBorder(16, 16, 16, 16, new ImageIcon("icons/cursor_PNG90.png"));
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
		Border titledBorder = BorderFactory.createTitledBorder(lineBorder, "Panel");
		Border titledBorder2 = BorderFactory.createTitledBorder(titledBorder, "NASLOV2");
		Border compaundBorder = BorderFactory.createCompoundBorder(emptyBorder, titledBorder);
		maliPanel.setBorder(compaundBorder);
		this.add(maliPanel);
		
		
		
	}

}
