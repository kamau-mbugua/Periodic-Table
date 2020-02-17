/*
*********************************************************************
* author : Kamau Mbugua										    *      
* E-mail Address: kamau_mbugua@yahoo.com/kelvinkamaumbugua@gmail.com		*
*				  +254727589261							*
*********************************************************************
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PeriodicSystem extends JFrame implements ActionListener 
{	
	//key declaration
	JButton H = new JButton("H");
	JButton Li = new JButton("Li");
	JButton Na = new JButton("Na");
	JButton K = new JButton("K");
	JButton Rb = new JButton("Rb");
	JButton Cs = new JButton("Cs");
	JButton Fr = new JButton("Fr");
	JButton Be = new JButton("Be");
	JButton Mg = new JButton("Mg");
	JButton Ca = new JButton("Ca");
	JButton Sr = new JButton("Sr");
	JButton Ba = new JButton("Ba");
	JButton Ra = new JButton("Ra");
	JButton Sc = new JButton("Sc");
	JButton Y = new JButton("Y");
	JButton La = new JButton("La");
	JButton Ac = new JButton("Ac");
	JButton Ti = new JButton("Ti");
	JButton Zr = new JButton("Zr");
	JButton Hf = new JButton("Hf");
	JButton Rf = new JButton("Rf");
	JButton V = new JButton("V");
	JButton Nb = new JButton("Nb");
	JButton Ta = new JButton("Ta");
	JButton Ha = new JButton("Ha");
	JButton Cr = new JButton("Cr");
	JButton Mo = new JButton("Mo");
	JButton W = new JButton("W");
	JButton Sg = new JButton("Sg");
	JButton Mn = new JButton("Mn");
	JButton Tc = new JButton("Tc");
	JButton Re = new JButton("Re");
	JButton Ns = new JButton("Ns");
	JButton Fe = new JButton("Fe");
	JButton Ru = new JButton("Ru");
	JButton Os = new JButton("Os");
	JButton Hs = new JButton("Hs");
	JButton Co = new JButton("Co");
	JButton Rd = new JButton("Rd");
	JButton Ir = new JButton("Ir");
	JButton Mt = new JButton("Mt");
	JButton Ni = new JButton("Ni");
	JButton Pd = new JButton("Pd");
	JButton Pt = new JButton("Pt");
	JButton Cu = new JButton("Cu");
	JButton Ag = new JButton("Ag");
	JButton Au = new JButton("Au");
	JButton Zn = new JButton("Zn");
	JButton Cd = new JButton("Cd");
	JButton Hg = new JButton("Hg");
	JButton B = new JButton("B");
	JButton Al = new JButton("Al");
	JButton Ga = new JButton("Ga");
	JButton In = new JButton("In");
	JButton Tl = new JButton("Tl");
	JButton C = new JButton("C");
	JButton Si = new JButton("Si");
	JButton Ge = new JButton("Ge");
	JButton Sn = new JButton("Sn");
	JButton Pb = new JButton("Pb");
	JButton N = new JButton("N");
	JButton P = new JButton("P");
	JButton As = new JButton("As");
	JButton Sb = new JButton("Sb");
	JButton Bi = new JButton("Bi");
	JButton O = new JButton("O");
	JButton S = new JButton("S");
	JButton Se = new JButton("Se");
	JButton Te = new JButton("Te");
	JButton Po = new JButton("Po");
	JButton F = new JButton("F");
	JButton Cl = new JButton("Cl");
	JButton Br = new JButton("Br");
	JButton I = new JButton("I");
	JButton At = new JButton("At");
	JButton He = new JButton("He");
	JButton Ne = new JButton("Ne");
	JButton Ar = new JButton("Ar");
	JButton Kr = new JButton("Kr");
	JButton Xe = new JButton("Xe");
	JButton Rn = new JButton("Rn");
	JButton Ce = new JButton("Ce");
	JButton Th = new JButton("Th");
	JButton Pr = new JButton("Pr");
	JButton Pa = new JButton("Pa");
	JButton Nd = new JButton("Nd");
	JButton U = new JButton("U");
	JButton Pm = new JButton("Pm");
	JButton Np = new JButton("Np");
	JButton Sm = new JButton("Sm");
	JButton Pu = new JButton("Pu");
	JButton Eu = new JButton("Eu");
	JButton Am = new JButton("Am");
	JButton Gd = new JButton("Gd");
	JButton Cm = new JButton("Cm");
	JButton Tb = new JButton("Tb");
	JButton Bk = new JButton("Bk");
	JButton Dy = new JButton("Dy");
	JButton Cf = new JButton("Cf");
	JButton Ho = new JButton("Ho");
	JButton Es = new JButton("Es");
	JButton Er = new JButton("Er");
	JButton Fm = new JButton("Fm");
	JButton Tm = new JButton("Tm");
	JButton Md = new JButton("Md");
	JButton Yb = new JButton("Yb");
	JButton No = new JButton("No");
	JButton Lu = new JButton("Lu");
	JButton Lr = new JButton("Lr");

	JButton solid/*solid*/ = new JButton();
	JButton liquid/*liquid*/ = new JButton();
	JButton artificial/*artificial*/ = new JButton();
	JButton gas /*gas*/= new JButton();
	
	JLabel lblsolid/*lblsolid*/ = new JLabel("Solid");
	JLabel lblliquid /*lblliquid*/= new JLabel("Liquid");
	JLabel lblgas /*lblgas*/= new JLabel("Gas");
	JLabel lblartificial /*lblartificial*/= new JLabel("Artificial");
	JLabel gol1a = new JLabel("I A");
	JLabel gol2a = new JLabel("II A");
	JLabel gol3a = new JLabel("III A");
	JLabel gol4a = new JLabel("IV A");
	JLabel gol5a = new JLabel("V A");
	JLabel gol6a = new JLabel("VI A");
	JLabel gol7a = new JLabel("VII A");
	JLabel gol8a = new JLabel("VIII A");
	JLabel gol1b = new JLabel("I B");
	JLabel gol2b = new JLabel("II B");
	JLabel gol3b = new JLabel("III B");
	JLabel gol4b = new JLabel("IV B");
	JLabel gol5b = new JLabel("V B");
	JLabel gol6b = new JLabel("VI B");
	JLabel gol7b = new JLabel("VII B");
	JLabel gol8b = new JLabel("<---  VIII B  --->");
	JLabel group/*group*/ = new JLabel("GROUP");
	JLabel p = new JLabel("P");
	JLabel e = new JLabel("E");
	JLabel r = new JLabel("R");
	JLabel pr = new JLabel("I");
	JLabel o = new JLabel("O");
	JLabel d = new JLabel("D");
	JLabel ee = new JLabel("E");
	JLabel per1 = new JLabel("1");
	JLabel per2 = new JLabel("2");
	JLabel per3 = new JLabel("3");
	JLabel per4 = new JLabel("4");
	JLabel per5 = new JLabel("5");
	JLabel per6 = new JLabel("6");
	JLabel per7 = new JLabel("7");
	JLabel lanta = new JLabel("Lantanida");
	JLabel actin/*actin*/ = new JLabel("Actinide");


	JMenuBar menubar;
	JMenu file ,menu ;
	JMenuItem exit/*exit*/, stoichiometry/*stoichiometry*/, did_U_know, about_me, Structure_Atom/*Structure_Atom*/, help , search/*Search*/; 


	JLabel lbltitle /*lbltitle*/= new JLabel ("PERIODIC SYSTEMS OF ELEMENTS");

	//container declaration
	private Container c = new Container();

	public PeriodicSystem()
	{
		super (".::Periodic Table::.");
		setResizable(false);
		setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
		setSize (1000,600);
		setLocation (15, 10);

		menubar = new JMenuBar();
		menubar.setBackground (Color.white);
		setJMenuBar(menubar);
		file = new JMenu("file");
		menu = new JMenu("menu");
		file.setBackground (Color.white);
		menu.setBackground (Color.white);
		menubar.add(file);
		menubar.add(menu);
		exit /*exit*/= new JMenuItem("Exit");
		exit /*exit*/.addActionListener (this);
		file.add(exit/*exit*/);
		stoichiometry/*stoichiometry*/ = new JMenuItem("stoichiometry");
		stoichiometry/*stoichiometry*/.addActionListener (this);
		menu.add(stoichiometry/*stoichiometry*/);/**/
		menu.addSeparator();
		Structure_Atom/*Structure_Atom*/  = new JMenuItem("Atomic Structure");
		Structure_Atom/*Structure_Atom*/ .addActionListener (this); 
		menu.addSeparator();
		did_U_know = new JMenuItem("Did you know?");
		did_U_know.addActionListener (this);
		menu.add(did_U_know);
		//help
		/*menu.addSeparator();
		search= new JMenuItem("search");
		search.addActionListener (this);
		menu.add(search);*/
		menu.addSeparator();
		help = new JMenuItem("Help?");
		help.addActionListener (this);
		menu.add(help);
		menu.addSeparator();
		about_me = new JMenuItem("About");
		about_me.addActionListener (this);
		menu.add(about_me);
		
		// to put the components on the frame
		c = getContentPane ();
		c.setLayout (null);
		
		c.add (H);
		c.add (Li);
		c.add (Na);
		c.add (K); 
		c.add (Rb);
		c.add (Cs);
		c.add (Fr); 
		c.add (Be);
		c.add (Mg);
		c.add (Ca);
		c.add (Sr);
		c.add (Ba);
		c.add (Ra);
		c.add (Sc);
		c.add (Y);
		c.add (La);
		c.add (Ac);
		c.add (Ti);
		c.add (Zr);
		c.add (Hf);
		c.add (Rf);
		c.add (V);
		c.add (Nb);
		c.add (Ta);
		c.add (Ha);
		c.add (Cr);
		c.add (Mo);
		c.add (W);
		c.add (Sg);
		c.add (Mn);
		c.add (Tc);
		c.add (Re);
		c.add (Ns);
		c.add (Fe);
		c.add (Ru);
		c.add (Os);
		c.add (Hs);
		c.add (Co);
		c.add (Rd);
		c.add (Ir);
		c.add (Mt);
		c.add (Ni);
		c.add (Pd);
		c.add (Pt);
		c.add (Cu);
		c.add (Ag);
		c.add (Au);
		c.add (Zn);
		c.add (Cd);
		c.add (Hg);
		c.add (B);
		c.add (Al);
		c.add (Ga);
		c.add (In);
		c.add (Tl);
		c.add (C);
		c.add (Si);
		c.add (Ge);
		c.add (Sn);
		c.add (Pb);
		c.add (N);
		c.add (P);
		c.add (As);
		c.add (Sb);
		c.add (Bi);
		c.add (O);
		c.add (S);
		c.add (Se);
		c.add (Te);
		c.add (Po);
		c.add (F);
		c.add (Cl);
		c.add (Br);
		c.add (I);
		c.add (At);
		c.add (He);
		c.add (Ne);
		c.add (Ar);
		c.add (Kr);
		c.add (Xe);
		c.add (Rn);
		c.add (Ce);
		c.add (Th);
		c.add (Pr);
		c.add (Pa);
		c.add (Nd);
		c.add (U);
		c.add (Pm);
		c.add (Np);
		c.add (Sm);
		c.add (Pu);
		c.add (Eu);
		c.add (Am);
		c.add (Gd);
		c.add (Cm);
		c.add (Tb);
		c.add (Bk);
		c.add (Dy);
		c.add (Cf);
		c.add (Ho);
		c.add (Es);
		c.add (Er);
		c.add (Fm);
		c.add (Tm);
		c.add (Md);
		c.add (Yb);
		c.add (No);
		c.add (Lu);
		c.add (Lr);

		c.add (lbltitle);
		//c.add (lbltitle);

		c.add (gol1a);
		c.add (gol2a);
		c.add (gol3a);
		c.add (gol4a);
		c.add (gol5a);
		c.add (gol6a);
		c.add (gol7a);
		c.add (gol8a);

		c.add (gol1b);
		c.add (gol2b);
		c.add (gol3b);
		c.add (gol4b);
		c.add (gol5b);
		c.add (gol6b);
		c.add (gol7b);
		c.add (gol8b);

		c.add (group/*group*/);
		c.add (p);
		c.add (e);
		c.add (r);
		c.add (pr);
		c.add (o);
		c.add (d);
		c.add (ee);
		

		c.add (per1);
		c.add (per2);
		c.add (per3);
		c.add (per4);
		c.add (per5);
		c.add (per6);
		c.add (per7);
		c.add (lanta);
		c.add (actin/*actin*/);

		//provides details on the color of the button

		c.add(solid/**/); c.add(liquid/**/); c.add(gas/**/); c.add(artificial/**/);
		c.add(lblsolid/**/);c.add(lblliquid/**/);c.add(lblgas);c.add(lblartificial/**/);
		solid/**/.setBackground (Color.red);
		liquid/**/.setBackground (Color.yellow);
		gas/**/.setBackground (Color.blue);
		artificial/**/.setBackground (Color.green);
		
		solid/**/.setBounds(30, 420, 30, 20);lblsolid/**/.setBounds(65, 420, 50, 20);
		gas/**/.setBounds(30, 445, 30, 20);lblgas/**/.setBounds(65, 445, 50, 20);
		liquid/**/.setBounds(30, 470, 30, 20);lblliquid/**/.setBounds(65, 470, 50, 20);
		artificial/**/.setBounds(30, 495, 30, 20);lblartificial/**/.setBounds(65, 495, 50, 20);

		solid/**/.setEnabled(false);
		gas.setEnabled(false);
		liquid/**/.setEnabled(false);
		artificial/**/.setEnabled(false);


		// ********************************************************
		// ************** button position and size*****************
		// ********************************************************
		//1a
		group.setBounds(348, 146, 100, 30);
		gol1a.setBounds (50, 20, 15, 20);
		per1.setBounds (20, 55, 10, 20);
		per2.setBounds (20, 110, 10, 20);
		per3.setBounds (20, 165, 10, 20);
		per4.setBounds (20, 217, 10, 20);
		per5.setBounds (20, 270, 10, 20);
		per6.setBounds (20, 323, 10, 20);
		per7.setBounds (20, 374, 10, 20);
		p.setBounds (5, 170, 10, 20);
		e.setBounds (5, 190, 10, 20);
		r.setBounds (5, 210, 10, 20);
		pr.setBounds (5, 230, 10, 20);
		o.setBounds (5, 250, 10, 20);
		d.setBounds (5, 270, 10, 20);
		ee.setBounds (5, 290, 10, 20);
		H.setBounds (30, 40, 53, 53);
		Li.setBounds (30, 93, 53, 53);
		Na.setBounds (30, 146, 53, 53);
		K.setBounds (30, 199, 53, 53);
		Rb.setBounds (30, 252, 53, 53);
		Cs.setBounds (30, 305, 53, 53);
		Fr.setBounds (30, 358, 53, 53);
		//2a
		gol2a.setBounds (100, 73, 20, 20);
		Be.setBounds (83, 93, 53, 53);
		Mg.setBounds (83, 146, 53, 53);
		Ca.setBounds (83, 199, 53, 53);
		Sr.setBounds (83, 252, 53, 53);
		Ba.setBounds (83, 305, 53, 53);
		Ra.setBounds (83, 358, 53, 53);
		//3b
		gol3b.setBounds (153, 179, 25, 20);
		Sc.setBounds (136, 199, 53, 53);
		Y.setBounds (136, 252, 53, 53);
		La.setBounds (136, 305, 53, 53);
		Ac.setBounds (136, 358, 53, 53);
		//4b
		gol4b.setBounds (205, 179, 25, 20);
		Ti.setBounds (189, 199, 53, 53);
		Zr.setBounds (189, 252, 53, 53);
		Hf.setBounds (189, 305, 53, 53);
		Rf.setBounds (189, 358, 53, 53);
		//5b
		gol5b.setBounds (260, 179, 25, 20);
		V.setBounds (242, 199, 53, 53);
		Nb.setBounds (242, 252, 53, 53);
		Ta.setBounds (242, 305, 53, 53);
		Ha.setBounds (242, 358, 53, 53);
		//6b 
		gol6b.setBounds (310, 179, 25, 20);
		Cr.setBounds (295, 199, 53, 53);
		Mo.setBounds (295, 252, 53, 53);
		W.setBounds (295, 305, 53, 53);
		Sg.setBounds (295, 358, 53, 53);
		//7b
		gol7b.setBounds (360, 179, 30, 20);
		Mn.setBounds (348, 199, 53, 53);
		Tc.setBounds (348, 252, 53, 53);
		Re.setBounds (348, 305, 53, 53);
		Ns.setBounds (348, 358, 53, 53);
		//8b
		gol8b.setBounds (440, 179, 100, 20);
		Fe.setBounds (401, 199, 53, 53);
		Ru.setBounds (401, 252, 53, 53);
		Os.setBounds (401, 305, 53, 53);
		Hs.setBounds (401, 358, 53, 53);
		Co.setBounds (454, 199, 53, 53);
		Rd.setBounds (454, 252, 53, 53);
		Ir.setBounds (454, 305, 53, 53);
		Mt.setBounds (454, 358, 53, 53);
		Ni.setBounds (507, 199, 53, 53);
		Pd.setBounds (507, 252, 53, 53);
		Pt.setBounds (507, 305, 53, 53);
		//1b
		gol1b.setBounds (580, 179, 20, 20);
		Cu.setBounds (560, 199, 53, 53);
		Ag.setBounds (560, 252, 53, 53);
		Au.setBounds (560, 305, 53, 53);
		//2b
		gol2b.setBounds (630, 179, 20, 20);
		Zn.setBounds (613, 199, 53, 53);
		Cd.setBounds (613, 252, 53, 53);
		Hg.setBounds (613, 305, 53, 53);
		//3a
		gol3a.setBounds (682, 73, 23, 20);
		B.setBounds (666, 93, 53, 53);
		Al.setBounds (666, 146, 53, 53);
		Ga.setBounds (666, 199, 53, 53);
		In.setBounds (666, 252, 53, 53);
		Tl.setBounds (666, 305, 53, 53);
		//4a
		gol4a.setBounds (735, 73, 23, 20);
		C.setBounds (719, 93, 53, 53);
		Si.setBounds (719, 146, 53, 53);
		Ge.setBounds (719, 199, 53, 53);
		Sn.setBounds (719, 252, 53, 53);
		Pb.setBounds (719, 305, 53, 53);
		//5a
		gol5a.setBounds (790, 73, 23, 20);
		N.setBounds (772, 93, 53, 53);
		P.setBounds (772, 146, 53, 53);
		As.setBounds (772, 199, 53, 53);
		Sb.setBounds (772, 252, 53, 53);
		Bi.setBounds (772, 305, 53, 53);
		//6a
		gol6a.setBounds (840, 73, 23, 20);
		O.setBounds (825, 93, 53, 53);
		S.setBounds (825, 146, 53, 53);
		Se.setBounds (825, 199, 53, 53);
		Te.setBounds (825, 252, 53, 53);
		Po.setBounds (825, 305, 53, 53);
		//7a
		gol7a.setBounds (890, 73, 28, 20);
		F.setBounds (878, 93, 53, 53);
		Cl.setBounds (878, 146, 53, 53);
		Br.setBounds (878, 199, 53, 53);
		I.setBounds (878, 252, 53, 53);
		At.setBounds (878, 305, 53, 53);
		//8a
		gol8a.setBounds (943, 20, 33, 20);
		He.setBounds (931, 40, 53, 53);
		Ne.setBounds (931, 93, 53, 53);
		Ar.setBounds (931, 146, 53, 53);
		Kr.setBounds (931, 199, 53, 53);
		Xe.setBounds (931, 252, 53, 53);
		Rn.setBounds (931, 305, 53, 53);
		
		//Lanthanides
		lanta.setBounds (180, 430, 60, 20);
		Ce.setBounds (242, 413, 53, 53);
		Pr.setBounds (295, 413, 53, 53);
		Nd.setBounds (348, 413, 53, 53);
		Pm.setBounds (401, 413, 53, 53);
		Sm.setBounds (454, 413, 53, 53);
		Eu.setBounds (507, 413, 53, 53);
		Gd.setBounds (560, 413, 53, 53);
		Tb.setBounds (613, 413, 53, 53);
		Dy.setBounds (666, 413, 53, 53);
		Ho.setBounds (719, 413, 53, 53);
		Er.setBounds (772, 413, 53, 53);
		Tm.setBounds (825, 413, 53, 53);
		Yb.setBounds (878, 413, 53, 53);
		Lu.setBounds (931, 413, 53, 53);
		//Actinida
		actin.setBounds (180, 480, 60, 20);
		Th.setBounds (242, 466, 53, 53);
		Pa.setBounds (295, 466, 53, 53);
		U.setBounds (348, 466, 53, 53);
		Np.setBounds (401, 466, 53, 53);
		Pu.setBounds (454, 466, 53, 53);
		Am.setBounds (507, 466, 53, 53);
		Cm.setBounds (560, 466, 53, 53);
		Bk.setBounds (613, 466, 53, 53);
		Cf.setBounds (666, 466, 53, 53);
		Es.setBounds (719, 466, 53, 53);
		Fm.setBounds (772, 466, 53, 53);
		Md.setBounds (825, 466, 53, 53);
		No.setBounds (878, 466, 53, 53);
		Lr.setBounds (931, 466, 53, 53);

		lbltitle.setBounds (200, 10, 500, 50);

		lbltitle.setFont (new Font ("arial", Font.BOLD, 25));

		group.setFont (new Font ("Times New Roman", Font.BOLD, 20));
		gol1a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol2a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol3a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol4a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol5a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol6a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol7a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol8a.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol1b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol2b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol3b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol4b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol5b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol6b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol7b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		gol8b.setFont (new Font ("Times New Roman", Font.BOLD, 10));
		per1.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per2.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per3.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per4.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per5.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per6.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		per7.setFont (new Font ("Times New Roman", Font.BOLD, 14));
		// ********************************************************
		// ************** background color on the button ************
		// ********************************************************
		// yellow
		Cs.setBackground (Color.yellow);
		Fr.setBackground (Color.yellow);
		Ga.setBackground (Color.yellow);
		Hg.setBackground (Color.yellow);
		Br.setBackground (Color.yellow);
		
		// blue
		H.setBackground (Color.blue);
		N.setBackground (Color.blue);
		O.setBackground (Color.blue);
		F.setBackground (Color.blue);
		Cl.setBackground (Color.blue);
		He.setBackground (Color.blue);
		Ne.setBackground (Color.blue);
		Ar.setBackground (Color.blue);
		Kr.setBackground (Color.blue);
		Xe.setBackground (Color.blue);
		Rn.setBackground (Color.blue);

		// green
		Tc.setBackground (Color.green);
		Rf.setBackground (Color.green);
		Ha.setBackground (Color.green);
		Sg.setBackground (Color.green);
		Ns.setBackground (Color.green);
		Hs.setBackground (Color.green);
		Mt.setBackground (Color.green);
		Pm.setBackground (Color.green);
		Np.setBackground (Color.green);
		Pu.setBackground (Color.green);
		Am.setBackground (Color.green);
		Cm.setBackground (Color.green);
		Bk.setBackground (Color.green);
		Cf.setBackground (Color.green);
		Es.setBackground (Color.green);
		Fm.setBackground (Color.green);
		Md.setBackground (Color.green);
		No.setBackground (Color.green);
		Lr.setBackground (Color.green);
		
		// red
		Li.setBackground (Color.red);
		Na.setBackground (Color.red);
		K.setBackground (Color.red);
		Rb.setBackground (Color.red);
		Be.setBackground (Color.red);
		Mg.setBackground (Color.red);
		Ca.setBackground (Color.red);
		Sr.setBackground (Color.red);
		Ba.setBackground (Color.red);
		Ra.setBackground (Color.red);
		Sc.setBackground (Color.red);
		Y.setBackground (Color.red);
		La.setBackground (Color.red);
		Ac.setBackground (Color.red);
		Ti.setBackground (Color.red);
		Zr.setBackground (Color.red);
		Hf.setBackground (Color.red);
		V.setBackground (Color.red);
		Nb.setBackground (Color.red);
		Ta.setBackground (Color.red);
		Cr.setBackground (Color.red);
		Mo.setBackground (Color.red);
		W.setBackground (Color.red);
		Mn.setBackground (Color.red);
		Re.setBackground (Color.red);
		Fe.setBackground (Color.red);
		Ru.setBackground (Color.red);
		Os.setBackground (Color.red);
		Co.setBackground (Color.red);
		Rd.setBackground (Color.red);
		Ir.setBackground (Color.red);
		Ni.setBackground (Color.red);
		Pd.setBackground (Color.red);
		Pt.setBackground (Color.red);
		Cu.setBackground (Color.red);
		Ag.setBackground (Color.red);
		Au.setBackground (Color.red);
		Zn.setBackground (Color.red);
		Cd.setBackground (Color.red);
		B.setBackground (Color.red);
		Al.setBackground (Color.red);
		In.setBackground (Color.red);
		Tl.setBackground (Color.red);
		C.setBackground (Color.red);
		Si.setBackground (Color.red);
		Ge.setBackground (Color.red);
		Sn.setBackground (Color.red);
		Pb.setBackground (Color.red);
		P.setBackground (Color.red);
		As.setBackground (Color.red);
		Sb.setBackground (Color.red);
		Bi.setBackground (Color.red);
		S.setBackground (Color.red);
		Se.setBackground (Color.red);
		Te.setBackground (Color.red);
		Po.setBackground (Color.red);
		I.setBackground (Color.red);
		At.setBackground (Color.red);
		Ce.setBackground (Color.red);
		Th.setBackground (Color.red);
		Pr.setBackground (Color.red);
		Pa.setBackground (Color.red);
		Nd.setBackground (Color.red);
		U.setBackground (Color.red);
		Sm.setBackground (Color.red);
		Eu.setBackground (Color.red);
		Gd.setBackground (Color.red);
		Tb.setBackground (Color.red);
		Dy.setBackground (Color.red);
		Ho.setBackground (Color.red);
		Er.setBackground (Color.red);
		Tm.setBackground (Color.red);
		Yb.setBackground (Color.red);
		Lu.setBackground (Color.red);

		// tooltip "to display text when the cursor is above the Element"
		H.setToolTipText ("Hydrogen");
		Li.setToolTipText ("Lithium");
		Na.setToolTipText ("Sodium");
		K.setToolTipText ("Potassium");
		Rb.setToolTipText ("Rubidium");
		Cs.setToolTipText ("Sensium");
		Fr.setToolTipText ("Fransium");
		Be.setToolTipText ("Beryllium");
		Mg.setToolTipText ("Magnesium");
		Ca.setToolTipText ("Calcium");
		Sr.setToolTipText ("Strontium");
		Ba.setToolTipText ("Barium");
		Ra.setToolTipText ("Radium");
		Sc.setToolTipText ("Scandium");
		Y.setToolTipText ("Yetrium");
		La.setToolTipText ("Lanthanum");
		Ac.setToolTipText ("Aktinium");
		Ti.setToolTipText ("Titanium");
		Zr.setToolTipText ("Zirconium");
		Hf.setToolTipText ("Hafnium");
		Rf.setToolTipText ("Rutherfordium");
		V.setToolTipText ("Vanadium");
		Nb.setToolTipText ("Niobium");
		Ta.setToolTipText ("Tantalum");
		Ha.setToolTipText ("Hahnium");
		Cr.setToolTipText ("Chromium");
		Mo.setToolTipText ("Molybdenum");
		W.setToolTipText ("Wolfram");
		Sg.setToolTipText ("Seaborgium");
		Mn.setToolTipText ("Manganese");
		Tc.setToolTipText ("Tecnetium");
		Re.setToolTipText ("Rhenium");
		Ns.setToolTipText ("Nielsbohrium");
		Fe.setToolTipText ("Iron");
		Ru.setToolTipText ("Ruthenium");
		Os.setToolTipText ("Osmium");
		Hs.setToolTipText ("Hassium");
		Co.setToolTipText ("Cobalt");
		Rd.setToolTipText ("Rhodium");
		Ir.setToolTipText ("Iridium");
		Mt.setToolTipText ("Meitnerium");
		Ni.setToolTipText ("Nickel");
		Pd.setToolTipText ("Palladium");
		Pt.setToolTipText ("Platinum");
		Cu.setToolTipText ("Copper");
		Ag.setToolTipText ("Silver");
		Au.setToolTipText ("Gold");
		Zn.setToolTipText ("Zinc");
		Cd.setToolTipText ("Cadnium");
		Hg.setToolTipText ("Mercury");
		B.setToolTipText ("Boron");
		Al.setToolTipText ("Aluminum");
		Ga.setToolTipText ("Gallium");
		In.setToolTipText ("Indium");
		Tl.setToolTipText ("Thalium");
		C.setToolTipText ("Carbon");
		Si.setToolTipText ("Silicon");
		Ge.setToolTipText ("Germanium");
		Sn.setToolTipText ("Tin");
		Pb.setToolTipText ("Lead");
		N.setToolTipText ("Nitrogen");
		P.setToolTipText ("Posforus");
		As.setToolTipText ("Arsenic");
		Sb.setToolTipText ("Antimony");
		Bi.setToolTipText ("Bismuth");
		O.setToolTipText ("Oxygen");
		S.setToolTipText ("Sulfur");
		Se.setToolTipText ("Selenium");
		Te.setToolTipText ("Tellurium");
		Po.setToolTipText ("Polonium");
		F.setToolTipText ("Flourin");
		Cl.setToolTipText ("Chlorine");
		Br.setToolTipText ("Bromin");
		I.setToolTipText ("Iodine");
		At.setToolTipText ("Astatin");
		He.setToolTipText ("Helium");
		Ne.setToolTipText ("Neon");
		Ar.setToolTipText ("Argon");
		Kr.setToolTipText ("Krypton");
		Xe.setToolTipText ("Xenon");
		Rn.setToolTipText ("Radon");
		Ce.setToolTipText ("Cerium");
		Pr.setToolTipText ("Praseodymium");
		Nd.setToolTipText ("Neodymium");
		Pm.setToolTipText ("Prometium");
		Sm.setToolTipText ("Samarium");
		Eu.setToolTipText ("Europium");
		Gd.setToolTipText ("Gadolinum");
		Tb.setToolTipText ("Terbium");
		Dy.setToolTipText ("Dysprosium");
		Ho.setToolTipText ("Holmium");
		Er.setToolTipText ("Erbium");
		Tm.setToolTipText ("Tulium");
		Yb.setToolTipText ("Yiterbium");
		Lu.setToolTipText ("Lutenium");
		Th.setToolTipText ("Thorium");
		Pa.setToolTipText ("Protaktinium");
		U.setToolTipText ("Uranium");
		Np.setToolTipText ("Neptunium");
		Pu.setToolTipText ("Plutonium");
		Am.setToolTipText ("Americium");
		Cm.setToolTipText ("Curium");
		Bk.setToolTipText ("Berkelium");
		Cf.setToolTipText ("Californium");
		Es.setToolTipText ("Einsteinium");
		Fm.setToolTipText ("Fermium");
		Md.setToolTipText ("Mendelevium");
		No.setToolTipText ("Nobelium");
		Lr.setToolTipText ("Lowrencium");

		H.addActionListener (this);
		Li.addActionListener (this);
		Na.addActionListener (this);
		K.addActionListener (this);
		Rb.addActionListener (this);
		Cs.addActionListener (this);
		Fr.addActionListener (this);

		Be.addActionListener (this);
		Mg.addActionListener (this);
		Ca.addActionListener (this);
		Sr.addActionListener (this);
		Ba.addActionListener (this);
		Ra.addActionListener (this);

		Sc.addActionListener (this);
		Y.addActionListener (this);
		La.addActionListener (this);
		Ac.addActionListener (this);

		Ti.addActionListener (this);
		Zr.addActionListener (this);
		Hf.addActionListener (this);
		Rf.addActionListener (this);

		V.addActionListener (this);
		Nb.addActionListener (this);
		Ta.addActionListener (this);
		Ha.addActionListener (this);

		Cr.addActionListener (this);
		Mo.addActionListener (this);
		W.addActionListener (this);
		Sg.addActionListener (this);

		Mn.addActionListener (this);
		Tc.addActionListener (this);
		Re.addActionListener (this);
		Ns.addActionListener (this);

		Fe.addActionListener (this);
		Ru.addActionListener (this);
		Os.addActionListener (this);
		Hs.addActionListener (this);
		Co.addActionListener (this);
		Rd.addActionListener (this);
		Ir.addActionListener (this);
		Mt.addActionListener (this);
		Ni.addActionListener (this);
		Pd.addActionListener (this);
		Pt.addActionListener (this);

		Cu.addActionListener (this);
		Ag.addActionListener (this);
		Au.addActionListener (this);

		Zn.addActionListener (this);
		Cd.addActionListener (this);
		Hg.addActionListener (this);

		B.addActionListener (this);
		Al.addActionListener (this);
		Ga.addActionListener (this);
		In.addActionListener (this);
		Tl.addActionListener (this);

		C.addActionListener (this);
		Si.addActionListener (this);
		Ge.addActionListener (this);
		Sn.addActionListener (this);
		Pb.addActionListener (this);

		N.addActionListener (this);
		P.addActionListener (this);
		As.addActionListener (this);
		Sb.addActionListener (this);
		Bi.addActionListener (this);

		O.addActionListener (this);
		S.addActionListener (this);
		Se.addActionListener (this);
		Te.addActionListener (this);
		Po.addActionListener (this);

		F.addActionListener (this);
		Cl.addActionListener (this);
		Br.addActionListener (this);
		I.addActionListener (this);
		At.addActionListener (this);

		He.addActionListener (this);
		Ne.addActionListener (this);
		Ar.addActionListener (this);
		Kr.addActionListener (this);
		Xe.addActionListener (this);
		Rn.addActionListener (this);

		Ce.addActionListener (this);
		Pr.addActionListener (this);
		Nd.addActionListener (this);
		Pm.addActionListener (this);
		Sm.addActionListener (this);
		Eu.addActionListener (this);
		Gd.addActionListener (this);
		Tb.addActionListener (this);
		Dy.addActionListener (this);
		Ho.addActionListener (this);
		Er.addActionListener (this);
		Tm.addActionListener (this);
		Yb.addActionListener (this);
		Lu.addActionListener (this);

		Th.addActionListener (this);
		Pa.addActionListener (this);
		U.addActionListener (this);
		Np.addActionListener (this);
		Pu.addActionListener (this);
		Am.addActionListener (this);
		Cm.addActionListener (this);
		Bk.addActionListener (this);
		Cf.addActionListener (this);
		Es.addActionListener (this);
		Fm.addActionListener (this);
		Md.addActionListener (this);
		No.addActionListener (this);
		Lr.addActionListener (this);    

		show();

	}
	
	public void actionPerformed (ActionEvent e)
	{
		
		{
			
			if (e.getSource() == H)
				{ 
					String lmb="H";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Li)
				{ 
					String lmb="Li";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Be)
				{ 
					String lmb="Be";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Na)
				{ 
					String lmb="Na";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == K)
				{ 
					String lmb="K";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Rb)
				{ 
					String lmb="Rb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cs)
				{ 
					String lmb="Cs";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
				
			else if (e.getSource() == Fr)
				{ 
					String lmb="Fr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Mg)
				{ 
					String lmb="Mg";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ca)
				{ 
					String lmb="Ca";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Sr)
				{ 
					String lmb="Sr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ba)
				{ 
					String lmb="Ba";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ra)
				{ 
					String lmb="Ra";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Sc)
				{ 
					String lmb="Sc";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Y)
				{ 
					String lmb="Y";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == La)
				{ 
					String lmb="La";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ac)
				{ 
					String lmb="Ac";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Ti)
				{ 
					String lmb="Ti";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Zr)
				{ 
					String lmb="Zr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Hf)
				{ 
					String lmb="Hf";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Rf)
				{ 
					String lmb="Rf";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == V)
				{ 
					String lmb="V";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Nb)
				{ 
					String lmb="Nb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ta)
				{ 
					String lmb="Ta";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ha)
				{ 
					String lmb="Ha";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cr)
				{ 
					String lmb="Cr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Mo)
				{ 
					String lmb="Mo";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
				
			else if (e.getSource() == W)
				{ 
					String lmb="W";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
				
			else if (e.getSource() == Sg)
				{ 
					String lmb="Sg";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Mn)
				{ 
					String lmb="Mn";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Tc)
				{ 
					String lmb="Tc";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Re)
				{ 
					String lmb="Re";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ns)
				{ 
					String lmb="Ns";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Fe)
				{ 
					String lmb="Fe";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
				
			else if (e.getSource() == Ru)
				{ 
					String lmb="Ru";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Os)
				{ 
					String lmb="Os";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Hs)
				{ 
					String lmb="Hs";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Co)
				{ 
					String lmb="Co";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Rd)
				{ 
					String lmb="Rd";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ir)
				{ 
					String lmb="Ir";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Mt)
				{ 
					String lmb="Mt";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ni)
				{ 
					String lmb="Ni";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Pd)
				{ 
					String lmb="Pd";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pt)
				{ 
					String lmb="Pt";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cu)
				{ 
					String lmb="Cu";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ag)
				{ 
					String lmb="Ag";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Au)
				{ 
					String lmb="Au";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Zn)
				{ 
					String lmb="Zn";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cd)
				{ 
					String lmb="Cd";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Hg)
				{ 
					String lmb="Hg";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == B)
				{ 
					String lmb="B";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
				
			else if (e.getSource() == Al)
				{ 
					String lmb="Al";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ga)
				{ 
					String lmb="Ga";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == In)
				{ 
					String lmb="In";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Tl)
				{ 
					String lmb="Tl";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == C)
				{ 
					String lmb="C";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Si)
				{ 
					String lmb="Si";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ge)
				{ 
					String lmb="Ge";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			else if (e.getSource() == Sn)
				{ 
					String lmb="Sn";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pb)
				{ 
					String lmb="Pb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == N)
				{ 
					String lmb="N";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == P)
				{ 
					String lmb="P";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == As)
				{ 
					String lmb="As";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Sb)
				{ 
					String lmb="Sb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Bi)
				{ 
					String lmb="Bi";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == O)
				{ 
					String lmb="O";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == S)
				{ 
					String lmb="S";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Se)
				{ 
					String lmb="Se";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Te)
				{ 
					String lmb="Te";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Po)
				{ 
					String lmb="Po";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == F)
				{ 
					String lmb="F";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cl)
				{ 
					String lmb="Cl";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Br)
				{ 
					String lmb="Br";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == I)
				{ 
					String lmb="I";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == At)
				{ 
					String lmb="At";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == He)
				{ 
					String lmb="He";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ne)
				{ 
					String lmb="Ne";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ar)
				{ 
					String lmb="Ar";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Kr)
				{ 
					String lmb="Kr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Xe)
				{ 
					String lmb="Xe";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Rn)
				{ 
					String lmb="Rn";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ce)
				{ 
					String lmb="Ce";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Th)
				{ 
					String lmb="Th";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pr)
				{ 
					String lmb="Pr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pa)
				{ 
					String lmb="Pa";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Nd)
				{ 
					String lmb="Nd";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == U)
				{ 
					String lmb="U";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pm)
				{ 
					String lmb="Pm";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			
			else if (e.getSource() == Np)
				{ 
					String lmb="Np";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Sm)
				{ 
					String lmb="Sm";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Pu)
				{ 
					String lmb="Pu";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Eu)
				{ 
					String lmb="Eu";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Am)
				{ 
					String lmb="Am";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Gd)
				{ 
					String lmb="Gd";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cm)
				{ 
					String lmb="Cm";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Tb)
				{ 
					String lmb="Tb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Bk)
				{ 
					String lmb="Bk";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Dy)
				{ 
					String lmb="Dy";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Cf)
				{ 
					String lmb="Cf";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Ho)
				{ 
					String lmb="Ho";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Es)
				{ 
					String lmb="Es";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Er)
				{ 
					String lmb="Er";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Fm)
				{ 
					String lmb="Fm";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Tm)
				{ 
					String lmb="Tm";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Md)
				{ 
					String lmb="Md";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Yb)
				{ 
					String lmb="Yb";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == No)
				{ 
					String lmb="No";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Lu)
				{ 
					String lmb="Lu";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}

			else if (e.getSource() == Lr)
				{ 
					String lmb="Lr";
				
					Info info =  new Info(lmb);
					info.tampilkan();			
				}
			else if(e.getSource() == did_U_know)
			{ 
				new Do_you_know();
			}
			else if (e.getSource() == stoichiometry )
			{
				new stoichiometry();
			}
			else if (e.getSource() == about_me )
			{
				new about();
			}
			else if(e.getSource() == exit)
			{
				System.exit(0);
			}
			else if (e.getSource() == Structure_Atom)
			{
				new AtomStructure();
			}
			/*else if (e.getSource() == search)
			{
				new cari_unsur();
			}*/
			else if (e.getSource() == help)
			{
				new help();
			}
			else
			{ 
				System.exit(0);
			}
		}
	}

	public static void main (String[] args)
	{
		SplashScreen splash = new SplashScreen(4000);
		splash.showSplashAndExit();

		new PeriodicSystem();

	}
}
	
