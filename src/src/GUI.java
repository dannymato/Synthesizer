package src;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import notes.A;
import notes.Ab;
import notes.B;
import notes.Bb;
import notes.C;
import notes.D;
import notes.Db;
import notes.E;
import notes.Eb;
import notes.F;
import notes.G;
import notes.Gb;
import notes.HC;
import notes.MA;
import notes.MAb;
import notes.MB;
import notes.MBb;
import notes.MC;
import notes.MD;
import notes.MDb;
import notes.ME;
import notes.MEb;
import notes.MF;
import notes.MG;
import notes.MGb;

public class GUI {
	
	public JFrame frame;
	static public ButtonGroup oscPicks;
	
	public LEdgeKey C;
	public LEdgeKey F;
	public LEdgeKey MC;
	public LEdgeKey MF;
	public LEdgeKey HC;
	
	public REdgeKey E;
	public REdgeKey B;
	public REdgeKey ME;
	public REdgeKey MB;
	
	
	public JButton[] bKeys = new JButton[10];
	
	public JButton D;
	public JButton G;
	public JButton A;
	public JButton MD;
	public JButton MG;
	public JButton MA;
	
	public static JRadioButton sineRad;
	public static JRadioButton squareRad;
	public static JRadioButton sawRad;
	
	public JPanel panel;
	
	public JSlider slide;
	
	public GUI(){
		mkFrame();
		mkBKeys();
		mkLEKeys();
		mkWKeys();
		mkREKeys();
		mkRads();
		mkSlide();
		frame.setVisible(true);
	}
	
	public void mkFrame(){
		
		frame = new JFrame("Danny\'s Synth");
		frame.setSize(1000, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		panel = new JPanel();
		panel.setSize(1000,500);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		frame.add(panel);
		
	}
	
	public void mkLEKeys(){
		C c = new C();
		C = new LEdgeKey("");
		C.setSize(50, 200);
		C.setLocation(50, 200);
		C.addMouseListener(c);
		C.addKeyListener(c);
		panel.add(C);
		panel.setComponentZOrder(C, 10);
		
		F f = new F();
		F = new LEdgeKey("");
		F.setSize(50, 200);
		F.setLocation(200, 200);
		F.addMouseListener(f);
		F.addKeyListener(f);
		panel.add(F);
		panel.setComponentZOrder(F	, 10);
		
		MC mc = new MC();
		MC = new LEdgeKey("");
		MC.setSize(50, 200);
		MC.setLocation(400, 200);
		MC.addMouseListener(mc);
		MC.addKeyListener(mc);
		panel.add(MC);
		panel.setComponentZOrder(MC, 10);
		
		MF mf = new MF();
		MF = new LEdgeKey("");
		MF.setSize(50, 200);
		MF.setLocation(550, 200);
		MF.addMouseListener(mf);
		MF.addKeyListener(mf);
		frame.add(MF);
		panel.setComponentZOrder(MF, 10);
		
		HC hc = new HC();
		HC = new LEdgeKey("");
		HC.setSize(50, 200);
		HC.setLocation(750, 200);
		HC.addMouseListener(hc);
		HC.addKeyListener(hc);
		frame.add(HC);
		panel.setComponentZOrder(HC, 10);
	}
	
	public void mkWKeys(){
		D d = new D();
		D = new JButton();
		D.setSize(50,100);
		D.setLocation(100, 300);
		D.addMouseListener(d);
		D.setBackground(Color.WHITE);
		D.addKeyListener(d);
		frame.add(D);
		panel.setComponentZOrder(D, 10);
		
		G g = new G();
		G = new JButton();
		G.setSize(50,100);
		G.setLocation(250, 300);
		G.addMouseListener(g);
		G.setBackground(Color.WHITE);
		G.addKeyListener(g);
		frame.add(G);
		panel.setComponentZOrder(G, 10);
		
		A a = new A();
		A = new JButton();
		A.setSize(50,100);
		A.setLocation(300, 300);
		A.addMouseListener(a);
		A.setBackground(Color.WHITE);
		A.addKeyListener(a);
		panel.add(A);
		panel.setComponentZOrder(A, 10);
		
		MD md = new MD();
		MD = new JButton();
		MD.setSize(50,100);
		MD.setLocation(450, 300);
		MD.addMouseListener(md);
		MD.setBackground(Color.WHITE);
		MD.addKeyListener(md);
		panel.add(MD);
		panel.setComponentZOrder(MD, 10);
		
		MG mg = new MG();
		MG = new JButton();
		MG.setSize(50,100);
		MG.setLocation(600, 300);
		MG.addMouseListener(mg);
		MG.setBackground(Color.WHITE);
		MG.addKeyListener(mg);
		panel.add(MG);
		panel.setComponentZOrder(MG, 10);
		
		MA ma = new MA();
		MA = new JButton();
		MA.setSize(50,100);
		MA.setLocation(650, 300);
		MA.addMouseListener(ma);
		MA.setBackground(Color.WHITE);
		MA.addKeyListener(ma);
		panel.add(MA);
		panel.setComponentZOrder(MA, 10);
		
		
	}
	
	public void mkREKeys(){
		E e = new E();
		E = new REdgeKey("");
		E.setSize(50, 200);
		E.setLocation(150,200);
		E.addMouseListener(e);
		E.addKeyListener(e);
		panel.add(E);
		panel.setComponentZOrder(E, 10);
		
		B b = new B();
		B = new REdgeKey("");
		B.setSize(50, 200);
		B.setLocation(350,200);
		B.addMouseListener(b);
		B.addKeyListener(b);
		panel.add(B);
		panel.setComponentZOrder(B, 10);
		
		ME me = new ME();
		ME = new REdgeKey("");
		ME.setSize(50, 200);
		ME.setLocation(500,200);
		ME.addMouseListener(me);
		ME.addKeyListener(me);
		panel.add(ME);
		panel.setComponentZOrder(ME, 10);
		
		MB mb = new MB();
		MB = new REdgeKey("");
		MB.setSize(50, 200);
		MB.setLocation(700,200);
		MB.addMouseListener(mb);
		MB.addKeyListener(mb);
		panel.add(MB);
		panel.setComponentZOrder(MB, 10);
				
	}
	
	public void mkBKeys(){
		
		for(int i = 0; i < bKeys.length; i++){
			bKeys[i] = new JButton();
			bKeys[i].setSize(50, 100);
			bKeys[i].setBackground(Color.BLACK);
		}
		
		Db db = new Db();
		Eb eb = new Eb();
		Gb gb = new Gb();
		Ab ab = new Ab();
		Bb bb = new Bb();
		MDb mdb = new MDb();
		MEb meb = new MEb();
		MGb mgb = new MGb();
		MAb mab = new MAb();
		MBb mbb = new MBb();
		
		bKeys[0].setLocation(75,200);
		bKeys[1].setLocation(125,200);
		bKeys[2].setLocation(225,200);
		bKeys[3].setLocation(275,200);
		bKeys[4].setLocation(325,200);
		bKeys[5].setLocation(425,200);
		bKeys[6].setLocation(475,200);
		bKeys[7].setLocation(575,200);
		bKeys[8].setLocation(625,200);
		bKeys[9].setLocation(675,200);
		
		bKeys[0].addMouseListener(db);
		bKeys[1].addMouseListener(eb);
		bKeys[2].addMouseListener(gb);
		bKeys[3].addMouseListener(ab);
		bKeys[4].addMouseListener(bb);
		bKeys[5].addMouseListener(mdb);
		bKeys[6].addMouseListener(meb);
		bKeys[7].addMouseListener(mgb);
		bKeys[8].addMouseListener(mab);
		bKeys[9].addMouseListener(mbb);
		
		bKeys[0].addKeyListener(db);
		bKeys[1].addKeyListener(eb);
		bKeys[2].addKeyListener(gb);
		bKeys[3].addKeyListener(ab);
		bKeys[4].addKeyListener(bb);
		bKeys[5].addKeyListener(mdb);
		bKeys[6].addKeyListener(meb);
		bKeys[7].addKeyListener(mgb);
		bKeys[8].addKeyListener(mab);
		bKeys[9].addKeyListener(mbb);
		
		for(int i = 0; i < bKeys.length;i++){
			panel.add(bKeys[i]);
			panel.setComponentZOrder(bKeys[i], i);
		}
		
		
	}
	
	public void mkRads(){
		
		oscPicks = new ButtonGroup();
		
		RadioAction r = new RadioAction();
		
		sineRad = new JRadioButton("Sine Wave");
		sineRad.setBounds(700, 50, 100, 20);
		oscPicks.add(sineRad);
		sineRad.setSelected(true);
		sineRad.setIcon((new ImageIcon(this.getClass().getResource("unlit.png"))));
		sineRad.setSelectedIcon((new ImageIcon(this.getClass().getResource("lit.png"))));
		sineRad.addActionListener(r);
		panel.add(sineRad);
		
		squareRad = new JRadioButton("Square Wave");
		squareRad.setBounds(700, 75, 150, 20);
		oscPicks.add(squareRad);
		squareRad.setIcon((new ImageIcon(this.getClass().getResource("unlit.png"))));
		squareRad.setSelectedIcon((new ImageIcon(this.getClass().getResource("lit.png"))));
		sineRad.addActionListener(r);
		panel.add(squareRad);
		
		sawRad = new JRadioButton("Sawtooth Wave");
		sawRad.setBounds(700, 100, 150, 20);
		sawRad.setIcon((new ImageIcon(this.getClass().getResource("unlit.png"))));
		sawRad.setSelectedIcon((new ImageIcon(this.getClass().getResource("lit.png"))));
		oscPicks.add(sawRad);
		sawRad.addActionListener(r);
		panel.add(sawRad);
		
	}
	
	public void mkSlide(){
		
		slide = new JSlider(0,100,100);
		slide.setBounds(50, 50, 200, 50);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		slide.setMajorTickSpacing(25);
		slide.setMinorTickSpacing(10);
		SliderAction s = new SliderAction();
		slide.addChangeListener(s);
			
		panel.add(slide);
		
	}

}
