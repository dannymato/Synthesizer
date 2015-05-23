package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MBb extends Note{
		
	private final static double PITCH = 830.609;
	
	public MBb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_J;
		
	}

	public MBb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_J;
	}
	

}
