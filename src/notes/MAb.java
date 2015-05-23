package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MAb extends Note{
		
	private final static double PITCH = 830.609;
	
	public MAb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_H;
		
	}

	public MAb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_H;
	}
	

}
