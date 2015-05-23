package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class A extends Note{
		
	private final static double PITCH = 440;
	
	public A(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_Y;
		
	}

	public A() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_Y;
	}
	

}
