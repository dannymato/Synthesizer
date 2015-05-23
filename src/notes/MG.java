package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MG extends Note{
		
	private final static double PITCH = 783.991;
	
	public MG(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_B;
		
	}

	public MG() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_B;
	}

}
