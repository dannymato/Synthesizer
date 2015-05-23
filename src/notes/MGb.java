package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MGb extends Note{
		
	private final static double PITCH = 739.989;
	
	public MGb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_G;
		
	}

	public MGb() {
		// TODO Auto-generated constructor stub
	}
	public void setKey(){
		key = KeyEvent.VK_G;
	}

}
