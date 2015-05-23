package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class Eb extends Note{
		
	private final static double PITCH = 311.127;
	
	public Eb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_3;
		
	}

	public Eb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_3;
	}

}
