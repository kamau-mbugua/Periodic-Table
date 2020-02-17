import java.awt.*;
import javax.swing.*;


public class help extends JFrame
{
	public JTextArea taHelp = new JTextArea();
	private Container c = new Container();
	String IsiHelp;

	public help()
	{
		super(".::HELP::.");
		setResizable(false);
		setDefaultCloseOperation (WindowConstants.HIDE_ON_CLOSE);
		setSize (600, 600);
		setLocation (200, 20);

		IsiHelp ="HOW TO USE\n\n" +
				 "A. To see information from an element:\n" +
				 "- Click on the element name we want. Then all information about that element will come out.\n" +
				 "- To close the information table, click the exit button. \n" +
				 "B. stoichiometry menu (mole concept / molar concentration): \n" +
				 "- Click the menu on the menubar, select stoichiometry. \n" +
				 "- Select the mole concept to calculate the mole, mass and Ar / Mr values ​​of an atom. \n" +
				 "* To find the mole value of an atom select mole. \n" +
				 "* Enter the value of the mass and ar. Click on the blank in each column and type \n" +
				 "value. \n" +
				 "* Click the process to get the mole value. \n" +
				 "* To find the value of mass and Ar / Mr, the method is the same as dancing the value of mole. \n" +
				 "* Click again to exit the mole concept and return to the stoichiometry menu. \n" +
				 "- Choose molar concentration to find the value of mole (n), volume (v) and molarity (M). \n" +
				 "* To find the mole value of an atom select mole. \n" +
				 "* Enter the volume and molarity values. Click in the blanks in each column and type \n" +
				 "value. \n" +
				 "* Click the process to find the value of volume and molarity, the same way to find the value of moles. \n" +
				 "* Click again to exit the molar concentration and return to the stoichiometry menu. \n" +
				 "C. Menu atomic structure: \n" +
				 "- Click on Atomic Structure on the menu. \n" +
				 "- Enter the atomic number you want (1-109). \n" +
				 "- Click the process to find out the name and configuration of the atom. \n" +
				 "- Click exit to return to the initial display. \n" +
				 "D. Menu Did you know? \n" +
				 "- Contains facts about the element, click next to see other facts. \n" +
				 "E. To exit the program select the file menu click exit.";
		
		c = getContentPane();
		c.setLayout (null);

		c.add(taHelp);
		taHelp.setBounds(10, 10, 575, 545);
		taHelp.setEditable(false);

		taHelp.setText(IsiHelp);		
		show();
	}
	public static void main(String[]args)
	{
		new help();
	}
}