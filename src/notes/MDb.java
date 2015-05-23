package notes;

import java.awt.event.KeyEvent;

import com.jsyn.unitgen.UnitOscillator;

public class MDb extends Note{
		
	private final static double PITCH = 554.365;
	
	public MDb(UnitOscillator g){
		
		super(g,PITCH);
		key = KeyEvent.VK_S;
		
	}

	public MDb() {
		// TODO Auto-generated constructor stub
	}
	
	public void setKey(){
		key = KeyEvent.VK_S;
	}
	

}
