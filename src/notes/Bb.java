package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class Bb extends Note{
		
	private final static double PITCH = 466.164;
	
	public Bb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_7;
		
	}

	public Bb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_7;
	}
	

}
