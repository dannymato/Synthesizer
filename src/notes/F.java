package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class F extends Note{
		
	private final static double PITCH = 349.228;
	
	public F(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_R;
		
	}

	public F() {
		// TODO Auto-generated constructor stub
	}
	public void setKey(){
		key = KeyEvent.VK_R;
	}
	

}
