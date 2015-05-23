package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class G extends Note{
		
	private final static double PITCH = 391.995;
	
	public G(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_T;
		
	}

	public G() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_T;
	}

}
