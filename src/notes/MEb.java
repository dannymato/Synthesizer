package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MEb extends Note{
		
	private final static double PITCH = 622.254;
	
	public MEb(UnitOscillator g){
		
		super(g,PITCH);
		
		key = KeyEvent.VK_D;
		
	}

	public MEb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_D;
	}

}
