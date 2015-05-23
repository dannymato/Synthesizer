package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class Gb extends Note{
		
	private final static double PITCH = 369.994;
	
	public Gb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_5;
		
	}

	public Gb() {
		// TODO Auto-generated constructor stub
	}
	

	public void setKey(){
		key = KeyEvent.VK_5;
	}
}
