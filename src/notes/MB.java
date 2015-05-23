package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MB extends Note{
		
	private final static double PITCH = 493.883;
	
	public MB(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_N;
		
	}

	public MB() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_N;
	}

}
