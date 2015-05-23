package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class B extends Note{
		
	private final static double PITCH = 493.883;
	
	public B(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_U;
		
	}

	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_U;
	}

}
