package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class D extends Note{
		
	private final static double PITCH = 293.665;
	
	public D(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_W;
	}

	public D() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_W;
	}

}
