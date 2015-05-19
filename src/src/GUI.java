package src;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {
	
	public JFrame frame;
	public ButtonGroup oscPicks;
	
	public LEdgeKey C;
	public LEdgeKey F;
	public LEdgeKey MC;
	public LEdgeKey MF;
	public LEdgeKey HC;
	
	public REdgeKey E;
	public REdgeKey B;
	public REdgeKey ME;
	public REdgeKey MB;
	
	public JButton[] bKEys = new JButton[10];
	
	public JButton D;
	public JButton G;
	public JButton A;
	public JButton MD;
	public JButton MG;
	public JButton MA;
	
	public GUI(){
		mkFrame();
		frame.setVisible(true);
	}
	
	public void mkFrame(){
		
		frame = new JFrame("Danny\'s Synth");
		frame.setSize(1000, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void mkLEKeys(){
		
	}

}
