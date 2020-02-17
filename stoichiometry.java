import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;


public class stoichiometry extends JFrame implements ActionListener
{
	//label
	JLabel lblstoichiometery= new JLabel("stoichiometry");
	JLabel lblMoleConcept = new JLabel("The concept of Mol");
	JLabel lblMolar = new JLabel("Molar Concentration");
	JLabel lblTopics = new JLabel("Select Topics :");
	JLabel lblmole = new JLabel("Mole (n)        :");
	JLabel lblmass = new JLabel("Mass (m) :");
	JLabel lblar_mr = new JLabel("Ar/Mr           :");
	JLabel lblSearch = new JLabel("Search value :");
	JLabel lblmoln = new JLabel("Mol (n)                :");
	JLabel lblmolar = new JLabel("Molarity (M)    :");
	JLabel lblvol = new JLabel("Volume (V)          :");

	//texts field
	JTextField tfmol = new JTextField();
	JTextField tfmass = new JTextField();
	JTextField tfar_mr = new JTextField();
	JTextField tfmolar = new JTextField();
	JTextField tfvol = new JTextField();
	JTextField tfkmol = new JTextField();

	
	//texts area
	JTextArea answer= new JTextArea();

	//radio button
	JRadioButton rbmoln = new JRadioButton("mole (n)",false);
	JRadioButton rbmass = new JRadioButton("mass (m)",false);
	JRadioButton rbar_mr = new JRadioButton("Ar/Mr",false);
	JRadioButton rbmol = new JRadioButton("The concept Mol",false);
	JRadioButton rbmolar = new JRadioButton("Concentrate Molar",false);
	JRadioButton rbvol = new JRadioButton("Volume (V)",false);
	JRadioButton rbmolarn = new JRadioButton("Molarity (M)",false);
	JRadioButton rbmolln = new JRadioButton("mole (n)",false);

	JButton btnprocess = new JButton("Process");
	JButton btnback = new JButton("come back");
	Container c =  new Container();

	DecimalFormat digit = new DecimalFormat("0.000");
	float moln, mass, ar_mr, molm, volume, molar;
	boolean consep_mol, cons_molar, c_mol, c_massa, c_ar, cn_mol, cn_mlr, cn_vol;
	
	public stoichiometry()
	{
		 super("stoichiometry");
		 setResizable(false);
		 setDefaultCloseOperation(HIDE_ON_CLOSE);
		 setSize(300, 380);
		 setLocation(100, 100);

		 c = getContentPane();
		 c.setLayout(null);
		
		 c.add(lblstoichiometery);
		 c.add(lblMoleConcept);
		 c.add(lblMolar);
		 c.add(lblTopics);
		 c.add(rbmol);
		 c.add(rbmolar);
		 c.add(btnprocess);
		 c.add(btnback);
		 c.add(lblSearch);
		 c.add(rbmoln);
		 c.add(rbmass);
		 c.add(rbar_mr);
		 c.add(lblmole);
		 c.add(lblmass);
		 c.add(lblar_mr);
		 c.add(tfmol);
		 c.add(tfmass);
		 c.add(tfar_mr);
		 c.add(answer);
		 c.add(lblmoln);
		 c.add(lblmolar);
		 c.add(lblvol);
		 c.add(tfmolar);
		 c.add(tfkmol);
		 c.add(tfvol);
		 c.add(rbvol);
		 c.add(rbmolarn);
		 c.add(rbmolln);

		//main
		 lblstoichiometery.setBounds (90, 10,190, 40);	
		 lblTopics.setBounds (20, 100, 200, 20);
		 rbmol.setBounds (20, 130, 200, 30);
		 rbmolar.setBounds (20, 160, 200, 30);	

		//mol
		 lblMoleConcept.setBounds (90, 5, 190, 40);
		 lblSearch.setBounds (10, 45, 150, 20);
		 rbmoln.setBounds (10, 70, 70, 20);
		 rbmass.setBounds (90, 70, 90, 20);
		 rbar_mr.setBounds (190, 70, 70, 20);
		 lblmole.setBounds (10, 95, 150, 20);
		 lblmass.setBounds (10, 120, 150, 20);
		 lblar_mr.setBounds (10, 145, 150, 20);
		 tfmol.setBounds (105, 95, 100, 25);
		 tfmass.setBounds (105, 120, 100, 25);
		 tfar_mr.setBounds (105, 145, 100, 25);
		 answer.setBounds (10, 175, 275, 120);
		 btnprocess.setBounds (155, 305, 80, 30);
		 btnback.setBounds (60, 305, 80, 30);

		 //molar
		 rbmolln.setBounds (10, 70, 70, 20);
		 rbvol.setBounds (80, 70, 80, 20);
		 rbmolarn.setBounds (165, 70, 100, 20);
		 lblmoln.setBounds (10, 95, 150, 20);
		 lblvol.setBounds (10, 120, 150, 20);
		 lblmolar.setBounds (10, 145, 150, 20);
		 tfkmol.setBounds (105, 95, 100, 25);
		 tfvol.setBounds (105, 120, 100, 25);
		 tfmolar.setBounds (105, 145, 100, 25);

         lblMoleConcept.setVisible (false);
		 lblSearch.setVisible (false);
		 rbmoln.setVisible (false);
		 rbmass.setVisible (false);
		 rbar_mr.setVisible (false);
		 lblmole.setVisible (false);
		 lblmass.setVisible (false);
		 lblar_mr.setVisible (false);
		 tfmol.setVisible (false);
		 tfmass.setVisible (false);
		 tfar_mr.setVisible (false);
		 answer.setVisible (false);
		 btnprocess.setVisible (false);
		 btnback.setVisible (false);

		 lblMolar.setVisible (false);
		 lblmoln.setVisible (false);
		 lblmolar.setVisible (false);
		 lblvol.setVisible (false);
		 tfkmol.setVisible (false);
		 tfmolar.setVisible (false);
		 tfvol.setVisible (false);
		 rbvol.setVisible (false);
		 rbmolarn.setVisible (false);
		 rbmolln.setVisible (false);

		 ButtonGroup grpmol = new ButtonGroup();
         grpmol.add(rbmoln);
         grpmol.add(rbmass);
		 grpmol.add(rbar_mr);

		 //molar
		 lblMolar.setBounds (60, 5, 190, 40);

		 ButtonGroup grpmolar = new ButtonGroup();
         grpmolar.add(rbvol);
         grpmolar.add(rbmolarn);
		 grpmolar.add(rbmolln);

		 lblstoichiometery.setFont (new Font ("arial", Font.BOLD, 20));
		 lblMoleConcept.setFont (new Font ("arial", Font.BOLD, 20));
		 lblMolar.setFont (new Font ("arial", Font.BOLD, 20));

		 ButtonGroup grputama = new ButtonGroup();
         grputama.add(rbmol);
         grputama.add(rbmolar);

		 rbmol.addActionListener(this);
		 rbmolar.addActionListener(this);
		 btnprocess.addActionListener(this);
		 btnback.addActionListener(this);
		 rbmoln.addActionListener(this);
		 rbmass.addActionListener(this);
		 rbar_mr.addActionListener(this);
		 rbvol.addActionListener(this);
		 rbmolarn.addActionListener(this);
		 rbmolln.addActionListener(this);


		 answer.setEditable(false);

	     answer.setLineWrap(true);
		 answer.setWrapStyleWord(true);
			
		 show();
	}

	class stoikiomtr
	{
		public float nilaiMoln(float mass, float ar_mr)
		{
			moln = mass / ar_mr;
			return moln;
		}

		public float nilaiMolms(float moln, float ar_mr)
		{
			mass = moln * ar_mr;
			return mass;
		}

		public float nilaiMolmr(float mass, float moln)
		{
			ar_mr = mass / moln;
			return ar_mr;
		}

		public float nilaiMolarn(float molar, float volume)
		{
			molm = molar * volume;
			return molm;
		}

		public float nilaiMolarmlr(float molm, float volume)
		{
			molar = molm / volume;
			return molar;
		}

		public float nilaiMolarvl(float molar, float molm)
		{
			volume = molm / molar;
			return volume;
		}
	}
	
	public void actionPerformed(ActionEvent evn)
	{
		if (evn.getActionCommand()== "Consep Mol")
		{ 
			consep_mol = true;
			cons_molar = false;

			lblstoichiometery.setVisible (false);
			lblTopics.setVisible (false);
			rbmol.setVisible (false);
			rbmolar.setVisible (false);

			lblMoleConcept.setVisible (true);
			lblSearch.setVisible (true);
		    rbmoln.setVisible (true);
			rbmass.setVisible (true);
		    rbar_mr.setVisible (true);
		    lblmole.setVisible (true);
		    lblmass.setVisible (true);
		    lblar_mr.setVisible (true);
		    tfmol.setVisible (true);
		    tfmass.setVisible (true);
		    tfar_mr.setVisible (true);
		    answer.setVisible (true);
			btnprocess.setVisible (true);
			btnback.setVisible (true);

			//clear the text field
			tfmol.setText("");
			tfmass.setText("");
			tfar_mr.setText("");
		}
		else if (evn.getActionCommand()== "Molar Concentration")
		{
			consep_mol = false;
			cons_molar = true;

			lblstoichiometery.setVisible (false);
			lblTopics.setVisible (false);
			rbmol.setVisible (false);
			rbmolar.setVisible (false);

			lblMolar.setVisible (true);
			lblSearch.setVisible (true);
			rbvol.setVisible (true);
			rbmolarn.setVisible (true);
		    rbmolln.setVisible (true);
			lblmoln.setVisible (true);
		    lblmolar.setVisible (true);
		    lblvol.setVisible (true);
			tfkmol.setVisible (true);
		    tfvol.setVisible (true);
		    tfmolar.setVisible (true);
			answer.setVisible (true);
			btnprocess.setVisible (true);
			btnback.setVisible (true);

			//membersihkan teks field
			tfkmol.setText("");
			tfmolar.setText("");
			tfvol.setText("");
		}
		else if (evn.getActionCommand()== "come back")
		{
			lblMoleConcept.setVisible (false);
			lblSearch.setVisible (false);
			rbmoln.setVisible (false);
			rbmass.setVisible (false);
		    rbar_mr.setVisible (false);
		    lblmole.setVisible (false);
        	lblmass.setVisible (false);
		    lblar_mr.setVisible (false);
		    tfmol.setVisible (false);
		    tfmass.setVisible (false);
		    tfar_mr.setVisible (false);
		    answer.setVisible (false);
		    btnprocess.setVisible (false);
		    btnback.setVisible (false);

		    lblMolar.setVisible (false);
		    lblmoln.setVisible (false);
		    lblmolar.setVisible (false);
		    lblvol.setVisible (false);
			tfkmol.setVisible (false);
		    tfmolar.setVisible (false);
		    tfvol.setVisible (false);
		    rbvol.setVisible (false);
		    rbmolarn.setVisible (false);
		    rbmolln.setVisible (false);

			lblstoichiometery.setVisible (true);
			lblTopics.setVisible (true);
			rbmol.setVisible (true);
			rbmolar.setVisible (true);

			answer.setText("");
		}
		else if (evn.getSource()==rbmoln)
		{
			c_mol = true;
			c_massa = false;
			c_ar = false;
			cn_mol = false;
			cn_mlr = false;
			cn_vol = false;

			tfmol.setEnabled(false);
			tfmass.setEnabled(true);
			tfar_mr.setEnabled(true);

			//clear the text field
			tfmol.setText("");
			tfmass.setText("");
			tfar_mr.setText("");
			answer.setText("");

		}
		else if (evn.getActionCommand()=="mass (m)")
		{
			c_mol = false;
			c_massa = true;
			c_ar = false;
			cn_mol = false;
			cn_mlr = false;
			cn_vol = false;

			tfmol.setEnabled(true);
			tfmass.setEnabled(false);
			tfar_mr.setEnabled(true);

			//clear the text field
			tfmol.setText("");
			tfmass.setText("");
			tfar_mr.setText("");
			answer.setText("");

		}
		else if (evn.getActionCommand()=="Ar/Mr")
		{
			c_mol = false;
			c_massa = false;
			c_ar = true;
			cn_mol = false;
			cn_mlr = false;
			cn_vol = false;

			tfmol.setEnabled(true);
			tfmass.setEnabled(true);
			tfar_mr.setEnabled(false);

			//clear the text field
			tfmol.setText("");
			tfmass.setText("");
			tfar_mr.setText("");
			answer.setText("");

		}
		else if (evn.getActionCommand()=="Volume (V)")
		{
			c_mol = false;
			c_massa = false;
			c_ar = false;
			cn_mol = false;
			cn_mlr = false;
			cn_vol = true;

			tfkmol.setEnabled(true);
			tfmolar.setEnabled(true);
			tfvol.setEnabled(false);

			//clear the text field
			tfkmol.setText("");
			tfmolar.setText("");
			tfvol.setText("");
			answer.setText("");
		}
		else if (evn.getActionCommand()=="Molarity (M)")
		{
			c_mol = false;
			c_massa = false;
			c_ar = false;
			cn_mol = false;
			cn_mlr = true;
			cn_vol = false;

			tfkmol.setEnabled(true);
			tfvol.setEnabled(true);
			tfmolar.setEnabled(false);

			//clear the text field
			tfkmol.setText("");
			tfmolar.setText("");
			tfvol.setText("");
			answer.setText("");
		}
		else if (evn.getSource()==rbmolln)
		{
			c_mol = false;
			c_massa = false;
			c_ar = false;
			cn_mol = true;
			cn_mlr = false;
			cn_vol = false;

			tfvol.setEnabled(true);
			tfmolar.setEnabled(true);
			tfkmol.setEnabled(false);

			//membersihkan teks field
			tfkmol.setText("");
			tfmolar.setText("");
			tfvol.setText("");
			answer.setText("");
		}
		else if (evn.getActionCommand()=="Process")
		{
			try
			{
				if (consep_mol == true)
				{
					if (c_mol == true)
					{
						mass = (Float.parseFloat(tfmass.getText().trim()));
						ar_mr = (Float.parseFloat(tfar_mr.getText().trim()));
						if (mass > 0 & ar_mr > 0)
						{
							stoikiomtr stk = new stoikiomtr();
						    moln = stk.nilaiMoln(mass, ar_mr);
							tfmol.setText(digit.format(moln));
							answer.setText(" n = m / Ar "+"\n"+" n = "+mass+" / "+ar_mr+"\n"+" n = "+digit.format(moln)+
									          "\n\n so, the answer is"+digit.format(moln)+" mol");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfmass.setText("");
							tfar_mr.setText("");
						}
					}
					else if (c_massa == true)
					{
						moln = (Float.parseFloat(tfmol.getText().trim()));
						ar_mr = (Float.parseFloat(tfar_mr.getText().trim()));
						if (moln > 0 & ar_mr > 0)
						{						
							stoikiomtr stk = new stoikiomtr();
							mass = stk.nilaiMolms(moln, ar_mr);
							tfmass.setText(digit.format(mass));
							answer.setText(" m = n * Ar "+"\n"+" m = "+moln+" * "+ar_mr+"\n"+" m = "+digit.format(mass)+
											  "\n\n so, the answer is"+digit.format(mass)+" gram");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfmol.setText("");
							tfar_mr.setText("");
						}
					}
					else if (c_ar == true)
					{
						mass = (Float.parseFloat(tfmass.getText().trim()));
						moln = (Float.parseFloat(tfmol.getText().trim()));
						if (mass > 0 & moln > 0)
						{
							stoikiomtr stk = new stoikiomtr();
							ar_mr = stk.nilaiMolmr(mass, moln);
							tfar_mr.setText(digit.format(ar_mr));
							answer.setText(" Ar = m / n "+"\n"+" Ar = "+mass+" / "+moln+"\n"+" Ar = "+digit.format(ar_mr)+
							              "\n\n so, the answer is"+digit.format(ar_mr));
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfmass.setText("");
							tfmol.setText("");
						}
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "select the value you are looking for!");
					}
				}

				else if (cons_molar == true)
				{
					if (cn_mol == true)
					{
						molar = (Float.parseFloat(tfmolar.getText().trim()));
						volume = (Float.parseFloat(tfvol.getText().trim()));
						if (molar > 0 & volume > 0)
						{
							stoikiomtr stk = new stoikiomtr();
							molm = stk.nilaiMolarn(molar, volume);
							tfkmol.setText(digit.format(molm));
							answer.setText(" n = M * V "+"\n"+" n = "+molar+" * "+volume+"\n"+" n = "+digit.format(molm)+
								          "\n\n so, the answer is"+digit.format(molm)+" mol");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfmolar.setText("");
							tfvol.setText("");
						}
					}
					else if (cn_vol == true)
					{
						molar = (Float.parseFloat(tfmolar.getText().trim()));
						molm = (Float.parseFloat(tfkmol.getText().trim()));
						if (molar > 0 & molm > 0)
						{
							stoikiomtr stk = new stoikiomtr();
							volume = stk.nilaiMolarvl(molar, molm);
							tfvol.setText(digit.format(volume));
							answer.setText(" V = n / M "+"\n"+" V = "+molm+" / "+molar+"\n"+" V = "+digit.format(volume)+
							              "\n\n so, the answer is"+digit.format(volume)+" litre");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfmolar.setText("");
							tfkmol.setText("");
						}
					}
					else if (cn_mlr == true)
					{
						volume = (Float.parseFloat(tfvol.getText().trim()));
						molm = (Float.parseFloat(tfkmol.getText().trim()));
						if (volume > 0 & molm > 0)
						{
							stoikiomtr stk = new stoikiomtr();
							molar = stk.nilaiMolarmlr(molm, volume);
							tfmolar.setText(digit.format(molar));
							answer.setText(" M = n / V "+"\n"+" M = "+molm+" / "+volume+"\n"+" M = "+digit.format(molar)+
								          "\n\n so, the answer is"+digit.format(molar)+" mol/liter");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
							tfvol.setText("");
							tfkmol.setText("");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "select the value you are looking for!");
					}
				}
				
			}
			catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "the data you entered is incorrect!" );
				//clear the text field
				tfkmol.setText("");
				tfmolar.setText("");
				tfvol.setText("");
				tfmol.setText("");
				tfmass.setText("");
				tfar_mr.setText("");
			}
			}
		else
		{
			System.exit(0);
		}

	}
	
	public static void main(String args[])
	{
		new stoichiometry();
	}
	

} 