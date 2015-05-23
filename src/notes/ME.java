package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class ME extends Note{
		
	private final static double PITCH = 659.255;
	
	public ME(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_C;
		
	}

	public ME() {
		// TODO Auto-generated constructor stub
	}
	

	public void setKey(){
		key = KeyEvent.VK_C;
	}
}
