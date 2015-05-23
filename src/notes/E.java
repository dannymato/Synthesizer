package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class E extends Note{
		
	private final static double PITCH = 329.628;
	
	public E(UnitOscillator g){
		
		super(g,PITCH);
		
		key = KeyEvent.VK_E;
		
	}

	public E() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_E;
	}
	
}
