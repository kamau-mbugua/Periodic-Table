import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class AtomStructure extends JFrame implements ActionListener
{
	JLabel lbltitle = new JLabel("Electron Configuration");
	JLabel lblinput = new JLabel("Enter the Atom number(1 - 109) :");
	JTextField tfinput = new JTextField();
	JTextArea answer= new JTextArea();
	JButton btnprocess = new JButton("process");
	JButton btnexit = new JButton("exit"); 
	Container c =  new Container();

	String[] sub_skin = { " 1s", " 2s", " 2p", " 3s", " 3p", " 4s", " 3d", " 4p", " 5s", " 4d", " 5p", " 6s",
							" 4f", " 5d", " 6p", " 7s", " 5f", " 6d", " 7p"};

	int[] electron = { 2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 6};

	int no_atom, temp, jml, y, x, z;
	String hsl, results, element, itsElements, nmusr;

	
	public AtomStructure()
	{
		 super("Atom Structure");
		 setResizable(false);
		 setDefaultCloseOperation(HIDE_ON_CLOSE);
		 setSize(300, 380);
		 setLocation(100, 100);

		 c = getContentPane();
		 c.setLayout(null);
		 c.add(lbltitle);
		 c.add(lblinput);
		 c.add(tfinput);
		 c.add(answer);
		 c.add(btnprocess);
		 c.add(btnexit);
		 
		 lbltitle.setBounds (55, 10,190, 40);	
		 lblinput.setBounds (20, 60, 200, 20);
		 tfinput.setBounds (220, 60, 40, 25);
		 answer.setBounds (20, 90, 255, 200);
		 btnprocess.setBounds (65, 300, 80, 30);
		 btnexit.setBounds (155, 300, 80, 30);

		 lbltitle.setFont (new Font ("arial", Font.BOLD, 18));

		 btnprocess.addActionListener(this);
		 btnexit.addActionListener(this);

		 answer.setEditable(false);

	     answer.setLineWrap(true);
		 answer.setWrapStyleWord(true);
		
		 show();

	}
	
	class nama_unsur
	{
	
	public String cari_unsur(int noatom)
	{
		try
		{
			//DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver()); for jdk 1.4.7
			Connection con = DriverManager.getConnection ("jdbc:odbc:periodic", "", "");
			Statement stat = con.createStatement();
			ResultSet dt = stat.executeQuery ("SELECT Nm_unsur FROM unsur_berkala WHERE No_atom =" + no_atom );
				
		
			while (dt.next())
			{
				nmusr = dt.getString ("Nm_element");
			}	
					
			element = nmusr;
			
				
			stat.close();
			con.close();
		}

		catch (Exception e)
		{
			System.out.println ("There is an error!!!" + e);
		}
		
		return element;	
			
	}
	
	}
	public void actionPerformed(ActionEvent evn)
	{
		if (evn.getActionCommand()== "process")
		{
			try
			{
				answer.setText("");
				no_atom = (Integer.parseInt(tfinput.getText().trim()));
				temp = no_atom;
				x = 0;
				z = 0;
				jml=1;
				results="";

				nama_unsur nm_usr = new nama_unsur();
				itsElements = nm_usr.cari_unsur(no_atom);

				if (temp > 0 & temp <= 109)
				{
				
					while (jml <= no_atom)
					{
						
						if (x == z)
						{
							y = electron[x];
							if (y < temp)
							{
								temp = temp - y;
								hsl = sub_skin[x] + y;
							}
							else
							{
								hsl = sub_skin[x] + temp;
							}

							jml = jml + y;
						}

						x++;
						z++;
						results = results + hsl;
					
					}

					answer.setText(" Name element :  " + itsElements + "\n" + " Electron Configuration :\n" + " " + String.valueOf(results));
			
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The data you entered is incorrect!" );
				}
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "The data you entered is incorrect!" );
			}

		}
		else 
		{
			
			hide();
		}

	}
	
	public static void main(String args[])
	{
		new AtomStructure();
	}

} 