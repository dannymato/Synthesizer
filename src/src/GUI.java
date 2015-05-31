package src;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.KeyStroke;

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
		mkKeys();
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
	//	C c = new C();
		C = new LEdgeKey("");
		C.setSize(50, 200);
		C.setLocation(50, 200);
		C.addMouseListener(Variables.notes[0]);
		panel.add(C);
		panel.setComponentZOrder(C, 10);
		
	//	F f = new F();
		F = new LEdgeKey("");
		F.setSize(50, 200);
		F.setLocation(200, 200);
		F.addMouseListener(Variables.notes[5]);
		panel.add(F);
		panel.setComponentZOrder(F	, 10);
		
	//	MC mc = new MC();
		MC = new LEdgeKey("");
		MC.setSize(50, 200);
		MC.setLocation(400, 200);
		MC.addMouseListener(Variables.notes[12]);
		panel.add(MC);
		panel.setComponentZOrder(MC, 10);
		
	//	MF mf = new MF();
		MF = new LEdgeKey("");
		MF.setSize(50, 200);
		MF.setLocation(550, 200);
		MF.addMouseListener(Variables.notes[17]);
		frame.add(MF);
		panel.setComponentZOrder(MF, 10);
		
	//	HC hc = new HC();
		HC = new LEdgeKey("");
		HC.setSize(50, 200);
		HC.setLocation(750, 200);
		HC.addMouseListener(Variables.notes[24]);
		frame.add(HC);
		panel.setComponentZOrder(HC, 10);
	}
	
	public void mkWKeys(){
	//	D d = new D();
		D = new JButton();
		D.setSize(50,100);
		D.setLocation(100, 300);
		D.addMouseListener(Variables.notes[2]);
		D.setBackground(Color.WHITE);
		frame.add(D);
		panel.setComponentZOrder(D, 10);
		
	//	G g = new G();
		G = new JButton();
		G.setSize(50,100);
		G.setLocation(250, 300);
		G.addMouseListener(Variables.notes[7]);
		G.setBackground(Color.WHITE);
		frame.add(G);
		panel.setComponentZOrder(G, 10);
		
	//	A a = new A();
		A = new JButton();
		A.setSize(50,100);
		A.setLocation(300, 300);
		A.addMouseListener(Variables.notes[9]);
		A.setBackground(Color.WHITE);
		panel.add(A);
		panel.setComponentZOrder(A, 10);
		
	//	MD md = new MD();
		MD = new JButton();
		MD.setSize(50,100);
		MD.setLocation(450, 300);
		MD.addMouseListener(Variables.notes[14]);
		MD.setBackground(Color.WHITE);
		panel.add(MD);
		panel.setComponentZOrder(MD, 10);
		
	//	MG mg = new MG();
		MG = new JButton();
		MG.setSize(50,100);
		MG.setLocation(600, 300);
		MG.addMouseListener(Variables.notes[19]);
		MG.setBackground(Color.WHITE);
		panel.add(MG);
		panel.setComponentZOrder(MG, 10);
		
	//	MA ma = new MA();
		MA = new JButton();
		MA.setSize(50,100);
		MA.setLocation(650, 300);
		MA.addMouseListener(Variables.notes[21]);
		MA.setBackground(Color.WHITE);
		panel.add(MA);
		panel.setComponentZOrder(MA, 10);
		
		
	}
	
	public void mkREKeys(){
	//	E e = new E();
		E = new REdgeKey("");
		E.setSize(50, 200);
		E.setLocation(150,200);
		E.addMouseListener(Variables.notes[4]);
		panel.add(E);
		panel.setComponentZOrder(E, 10);
		
	//	B b = new B();
		B = new REdgeKey("");
		B.setSize(50, 200);
		B.setLocation(350,200);
		B.addMouseListener(Variables.notes[11]);
		panel.add(B);
		panel.setComponentZOrder(B, 10);
		
	//	ME me = new ME();
		ME = new REdgeKey("");
		ME.setSize(50, 200);
		ME.setLocation(500,200);
		ME.addMouseListener(Variables.notes[16]);
		panel.add(ME);
		panel.setComponentZOrder(ME, 10);
		
	//	MB mb = new MB();
		MB = new REdgeKey("");
		MB.setSize(50, 200);
		MB.setLocation(700,200);
		MB.addMouseListener(Variables.notes[23]);
		panel.add(MB);
		panel.setComponentZOrder(MB, 10);
				
	}
	
	public void mkBKeys(){
		
		for(int i = 0; i < bKeys.length; i++){
			bKeys[i] = new JButton();
			bKeys[i].setSize(50, 100);
			bKeys[i].setBackground(Color.BLACK);
		}
		
	/*	Db db = new Db();
		Eb eb = new Eb();
		Gb gb = new Gb();
		Ab ab = new Ab();
		Bb bb = new Bb();
		MDb mdb = new MDb();
		MEb meb = new MEb();
		MGb mgb = new MGb();
		MAb mab = new MAb();
		MBb mbb = new MBb();*/
		
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
		
		bKeys[0].addMouseListener(Variables.notes[1]);
		bKeys[1].addMouseListener(Variables.notes[3]);
		bKeys[2].addMouseListener(Variables.notes[6]);
		bKeys[3].addMouseListener(Variables.notes[8]);
		bKeys[4].addMouseListener(Variables.notes[10]);
		bKeys[5].addMouseListener(Variables.notes[13]);
		bKeys[6].addMouseListener(Variables.notes[15]);
		bKeys[7].addMouseListener(Variables.notes[18]);
		bKeys[8].addMouseListener(Variables.notes[20]);
		bKeys[9].addMouseListener(Variables.notes[22]);
		

		
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
	
	public void mkKeys(){
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("Q"), "C");
		panel.getActionMap().put("C", Variables.notes[0]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("2"), "Db");
		panel.getActionMap().put("Db", Variables.notes[1]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "D");
		panel.getActionMap().put("D", Variables.notes[2]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0), "Eb");
		panel.getActionMap().put("Eb", Variables.notes[3]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0), "E");
		panel.getActionMap().put("E", Variables.notes[4]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), "F");
		panel.getActionMap().put("F", Variables.notes[5]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0), "Gb");
		panel.getActionMap().put("Gb", Variables.notes[6]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_T, 0), "G");
		panel.getActionMap().put("G", Variables.notes[7]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0), "Ab");
		panel.getActionMap().put("Ab", Variables.notes[8]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, 0), "A");
		panel.getActionMap().put("A", Variables.notes[9]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0), "Bb");
		panel.getActionMap().put("Bb", Variables.notes[10]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_U, 0), "B");
		panel.getActionMap().put("B", Variables.notes[11]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, 0), "MC");
		panel.getActionMap().put("MC", Variables.notes[12]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "MDb");
		panel.getActionMap().put("MDb", Variables.notes[13]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, 0), "MD");
		panel.getActionMap().put("MD", Variables.notes[14]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "MEb");
		panel.getActionMap().put("MEb", Variables.notes[15]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), "ME");
		panel.getActionMap().put("ME", Variables.notes[16]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, 0), "MF");
		panel.getActionMap().put("MF", Variables.notes[17]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_G, 0), "MGb");
		panel.getActionMap().put("MGb", Variables.notes[18]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "MG");
		panel.getActionMap().put("MG", Variables.notes[19]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), "MAb");
		panel.getActionMap().put("MAb", Variables.notes[20]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, 0), "MA");
		panel.getActionMap().put("MA", Variables.notes[21]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_J, 0), "MBb");
		panel.getActionMap().put("MBb", Variables.notes[22]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "MB");
		panel.getActionMap().put("MB", Variables.notes[23]);
		
		panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0), "HC");
		panel.getActionMap().put("HC", Variables.notes[24]);
		
		
		
	}

}
