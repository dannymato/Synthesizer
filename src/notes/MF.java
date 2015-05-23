package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MF extends Note{
		
	private final static double PITCH = 698.456;
	
	public MF(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_V;
		
	}

	public MF() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_V;
	}

}
