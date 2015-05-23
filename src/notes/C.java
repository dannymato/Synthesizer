package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class C extends Note{
		
	private final static double PITCH = 261.626;
	
	public C(UnitOscillator g){
		
		super(g,PITCH);
		
		
		
	}
	
	public void setKey(){
		key = KeyEvent.VK_Q;
	}
	
	public C(){}
	


}
