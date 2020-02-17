import javax.swing.*;
import java.awt.*;

public class about extends JFrame 
{
	JLabel image = new JLabel(new ImageIcon("picture/mmust1.jpg"));
	JLabel name = new JLabel("Name  :Kamau Mbugua ");
	JLabel RegNum = new JLabel("Reg Number   :SIT/B/01-02265/2017 ");
	JLabel YoS = new JLabel("Year of Study : 2019/2020");
	JLabel University = new JLabel("Masinde Muliro University of Science and Technology");
	JLabel Year = new JLabel("2020");
	Container c = new Container ();

	public about()  
	{
		super(".::About the Developer::.");
		setDefaultCloseOperation (WindowConstants.HIDE_ON_CLOSE);
		setResizable(false);
		setSize(400, 250);
 
		c = getContentPane();
		c.setLayout (null);
		c.add(image);
		c.add(name);
		c.add(RegNum);
		c.add(YoS);
		c.add(University);
		c.add(Year);

		image.setBounds (10, 10, 100, 100);
		name.setBounds (120, 7, 300, 20);
		RegNum.setBounds (120, 37, 300, 20);
		YoS.setBounds (120, 67, 300, 20);
		University.setBounds (5, 120, 300, 30);
		Year.setBounds (120, 140, 60, 30);
		University.setFont (new Font ("arial", Font.BOLD, 12));
		Year.setFont (new Font ("arial", Font.BOLD, 20));
		show();

	}
	
	public static void main (String []args)
	{
		new about();
	}
	
}