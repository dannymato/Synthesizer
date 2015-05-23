package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class Db extends Note{
		
	private final static double PITCH = 277.183;
	
	public Db(UnitOscillator g){
		
		super(g,PITCH);
		
		key = KeyEvent.VK_2;
		
	}

	public Db() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_2;
	}

}
