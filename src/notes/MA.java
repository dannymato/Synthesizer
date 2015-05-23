package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MA extends Note{
		
	private final static double PITCH = 880.000;
	
	public MA(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_N;
		
	}

	public MA() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_N;
	}
	

}
