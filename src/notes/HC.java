package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class HC extends Note{
		
	private final static double PITCH = 523.251;
	
	public HC(UnitOscillator g){
		
		super(g,PITCH);
		
		key = KeyEvent.VK_COMMA;
		
	}

	public HC() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_COMMA;
	}

}
