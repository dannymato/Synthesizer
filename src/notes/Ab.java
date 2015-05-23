package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class Ab extends Note{
		
	private final static double PITCH = 415.305;
	
	public Ab(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_6;
		
	}

	public Ab() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_6;
	}

}
