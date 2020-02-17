
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Info extends JFrame implements ActionListener 
{	
	
	public String lmbg = "", nmusr = "", tkoks = "", noa = "", msa = "", ttd = "",leh = "",msj = "";
	//public String more = "", nmusr = "", tkoks = "", free = "", msa = "", ttd = "",ok = "",msj = "";
	
	JLabel symbol= new JLabel   ("Symbol        : ");
	JLabel element= new JLabel  ("Element Name  : ");
	JLabel atomic = new JLabel   ("Atomic Number : ");
	JLabel mass= new JLabel     ("Mass Atom     : ");
	JLabel oxidation= new JLabel("Oxidation rate: ");
	JLabel boiling= new JLabel  ("Boiling point : ");
	JLabel melting= new JLabel  ("Melting point : ");
	JLabel Mtype= new JLabel    ("Mass Type     : ");
	//text field declarations
	JTextField tfsymbol= new JTextField ();
	JTextField tfelement= new JTextField ();
	JTextField tfatomic= new JTextField ();
	JTextField tfmass= new JTextField ();
	JTextField tfoxidation= new JTextField ();
	JTextField tfboiling= new JTextField ();
	JTextField tfmelting= new JTextField ();
	JTextField tfMtype= new JTextField ();

	JButton exit = new JButton("Exit");
	public String lm, lmb;


	private Container c = new Container ();

	public Info(String lam)
	
	{
		super (".::Information::.");
		setResizable(false);
		setDefaultCloseOperation (WindowConstants.HIDE_ON_CLOSE);
		setSize (230, 350);
		setLocation (100, 100);
		
		lm=lam;


		c = getContentPane();
		c.setLayout (null);
		c.add (symbol/**/);
		c.add (element/**/);
		c.add (atomic/**/);
		c.add (mass/**/);
		c.add (oxidation/**/);
		c.add (boiling/**/);
		c.add (melting/**/);
		c.add (Mtype/**/);
		c.add (tfsymbol/**/);
		c.add (tfelement/**/);
		c.add (tfatomic/**/);
		c.add (tfmass/**/);
		c.add (tfoxidation/**/);
		c.add (tfboiling/**/);
		c.add (tfmelting/**/);
		c.add (tfMtype/**/);
		c.add (exit/**/);

		symbol/**/.setBounds (10, 20, 110, 20);
		element/**/.setBounds (10, 50, 110, 20);
		atomic/**/.setBounds (10, 80, 110, 20);
		mass/**/.setBounds (10, 110, 110, 20);
		oxidation/**/.setBounds (10, 140, 110, 20);
		boiling/**/.setBounds (10, 170, 110, 20);
		melting/**/.setBounds (10, 200, 110, 20);
		Mtype/**/.setBounds (10, 230, 110, 20);

		tfsymbol/**/.setBounds (115, 15, 90, 30);
		tfelement/**/.setBounds (115, 45, 90, 30);
		tfatomic/**/.setBounds (115, 75, 90, 30);
		tfmass/**/.setBounds (115, 105, 90, 30);
		tfoxidation/**/.setBounds (115, 135, 90, 30);
		tfboiling/**/.setBounds (115, 165, 90, 30);
		tfmelting/**/.setBounds (115, 195, 90, 30);
		tfMtype/**/.setBounds (115, 225, 90, 30);

		exit/**/.setBounds (78, 275, 75, 30);

		

		tfsymbol/**/.setEnabled(false);
		tfelement/**/.setEnabled(false);
		tfatomic/**/.setEnabled(false);
		tfmass/**/.setEnabled(false);
		tfoxidation/**/.setEnabled(false);
		tfboiling/**/.setEnabled(false);
		tfmelting/**/.setEnabled(false);
		tfMtype/**/.setEnabled(false);
		
		

		symbol/**/.setFont (new Font ("arial", Font.BOLD, 10));
		element/**/.setFont (new Font ("arial", Font.BOLD, 10));
		atomic/**/.setFont (new Font ("arial", Font.BOLD, 10));
		mass/**/.setFont (new Font ("arial", Font.BOLD, 10));
		oxidation/**/.setFont (new Font ("arial", Font.BOLD, 10));
		boiling/**/.setFont (new Font ("arial", Font.BOLD, 10));
		melting/**/.setFont (new Font ("arial", Font.BOLD, 10));
		Mtype/**/.setFont (new Font ("arial", Font.BOLD, 10));

		tfsymbol/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfelement/**/.setFont (new Font ("comic sans MS", Font.BOLD, 12));
		tfatomic/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfmass/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfoxidation/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfboiling/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfmelting/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		tfMtype/**/.setFont (new Font ("comic sans MS", Font.BOLD, 15));
		
		exit/**/.addActionListener (this);

		show();

	}

	public void tampilkan()
	{
		lmb=lm;
		try
		{ 
			// connection to the database
			//DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver()); -> untuk jdk 1.4.7
			Connection con = DriverManager.getConnection ("jdbc:odbc:periodik", "", "");
			Statement stat = con.createStatement();
			ResultSet dat = stat.executeQuery ("SELECT * FROM unsur_berkala/*periodic_element*/ WHERE lambang /*symbol*/ ='" + lmb + "'");
				
			while (dat.next())
			{
				lmbg = dat.getString ("symbol");
				nmusr = dat.getString ("Nm_ element");
				tkoks = dat.getString ("tk_oxidation");
				noa = dat.getString ("No_atom");
				msa = dat.getString ("Ms_atom");
				ttd = dat.getString ("not_boiling");
				leh = dat.getString ("not_melted");
				msj = dat.getString ("Ms_type");
			}	

			tfsymbol.setText(nmusr);
			tfelement.setText(lmbg);
			tfatomic.setText(noa);
			tfmass.setText(msa);
			tfoxidation.setText(tkoks);
			tfboiling.setText(ttd + "   C");
			tfmelting.setText(leh + "   C");
			tfMtype.setText(msj + " g/mL");
				
			stat.close();
			con.close();
		}

		catch (Exception e)
		{
			System.out.println ("There is an error !!!" + e);
		}
		
	}
	public void actionPerformed (ActionEvent z)
	{
		
		if (z.getSource() == exit)
			{ 
				hide();
			}
			
			
		
	}
/*
	public static void main (String[] args)
	{
		//new Info();

	

	}
	*/

}