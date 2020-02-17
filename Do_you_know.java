import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Do_you_know extends JFrame implements ActionListener
{
	public JTextArea textArea = new JTextArea();
	JButton following = new JButton("next");
	JButton before = new JButton("back");
	public int i = 0;
	String[] info = new String[30];
	 

	private Container c = new Container ();

	public Do_you_know()
	{
		super(".::Did you know?::.");
		setResizable(false);
		setDefaultCloseOperation (WindowConstants.HIDE_ON_CLOSE);
		setSize (400, 200);
		setLocation (200, 200);
		
		
		//
		info[0] = "In 1869, German chemist Lothar Meyer \n" +
				"and Russian Dmitry Ivanovich Mendeleyev \n" +
				"almost simultaneously developing the first periodic table";
		info[1] = "Solid carbon dioxide is commonly known as the term 'dry ice'";
		info[2] = "Calcium is a micromineral in the body that plays a role in bone and tooth formation.";
		info[3] = "Hydrogen comes from the Greek Hydrogenium: hydro: water, genes: forms.";
		info [4] = "Hydrogen is the lightest and most abundant element in the universe.";
		info [5] = "Helium is used to fly airship (one of a kind)";
		info [6] = "Argon is used in titanium welding in the manufacture of aircraft and rockets.";
		info [7] = "Neon can be used as fluorescent lamp, cooler, high voltage indicator," +
		"lightning bolts, and for filling television tubes.";
		info [8] = "Krypton is used in flash for high speed photography.";
		info [9] = "Xenon is used in the manufacture of lamps for bactericides.";
		info [10] = "Helium comes from the Greek word Helios meaning sun.";
		info [11] = "Flourin is used in the manufacture of freon, freon is often used as a gas cooler" +
		"in the refrigerator or air conditioning, this gas can damage the ozone layer.";
		info [12] = "Flourin is used in the manufacture of teflon, which is a heat-resistant plastic" +
		"and are insulated to be used in the cooker or ironing layer.";
		info [13] = "Floured salt is added to toothpaste or toothpaste to prevent tooth decay.";
		info [14] = "Floured acid (HF) can dissolve glass, so it can be used" +
		"to make glass or blur glass.";
		info [15] = "Chloride acid (HCl) is used to remove rust from iron.";
		info [16] = "Hyperchlorite ions can be used as bleach for clothing, to kill bacteria and fungi in water.";
		info [17] = "Kitchen salt (NaCl) is used for salt additions to foods.";
		info [18] = "Chlorine is used as a base for insecticides.";
		info [19] = "Bromine compounds (KBr, NaBr) are used as sedative substances (sedatives or sleeping pills).";
		info [20] = "Iodine is used in iodine tincture as a wound cure.";
		info [21] = "The color of the fireworks comes from magnesium (white)," +
		"barium (red) and sodium (yellow).";
		info [22] = "Sodium bicarbonate is used as a developer in the baking process.";
		info [23] = "Sodium benzoate is used as a preservative in food and beverage processing.";
		info [24] = "Sodium nitrite is used as a lard in the process of making processed meats such as sausages or cornet.";
		info [25] = "Sodium was discovered in 1817 by an English scientist named Humphrey Davy.";
		info [26] = "Potassium or potassium in the human body is a micromineral that plays a role in the transmission of nerve impulses.";
		info [27] = "Potassium sorbate is commonly used as a preservative in the cheese making process.";
		info [28] = "Potassium nitrate is commonly used as a catalyst in the manufacture of explosives.";
		info [29] = "The calcium in the body plays a role in the blood clotting process when you have a wound.";
		c = getContentPane();
		c.setLayout (null);

		c.add(textArea);
		c.add(following);
		c.add(before);
		
		textArea.setBounds (10, 10, 370, 120);
		following.setBounds (300, 140, 80, 20);
		before.setBounds (210, 140, 80, 20);

		textArea.setFont (new Font ("comic sans MS", Font.BOLD, 14));

		
		following.setToolTipText ("Displays the next information");

		textArea.setEditable(false);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		
		
		following.addActionListener (this);
		before.addActionListener (this);

		textArea.setText(info[i]);
		show();

	}

	public void actionPerformed (ActionEvent z)
	{
		if (z.getSource() == before)
		{
			if (i==0)
			{
				i=29;
				textArea.setText(info[i]);
			}
			else
			{
				i--;
				textArea.setText(info[i]);
			}
		}
		if (z.getSource() == following)
		{ 
			if (i<29)
			{
				following.setEnabled(true);
				i++;
				textArea.setText(info[i]);
			}
			else
			{
				
				i = -1;
			}
				
		}
	}

public static void main (String[] args)	{
		new Do_you_know();
}
}
