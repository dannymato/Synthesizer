package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MC extends Note{
		
	private final static double PITCH = 523.251;
	
	public MC(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_Z;
		
	}

	public MC() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_Z;
	}
	

}
