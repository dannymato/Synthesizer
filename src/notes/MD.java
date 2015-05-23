package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MD extends Note{
		
	private final static double PITCH = 587.330;
	
	public MD(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_X;
		
	}

	public MD() {
		// TODO Auto-generated constructor stub
	}
	public void setKey(){
		key = KeyEvent.VK_X;
	}

}
