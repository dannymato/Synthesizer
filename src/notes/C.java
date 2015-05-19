package notes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import src.Variables;

import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitOscillator;

public class C extends Note{
		
	private final static double PITCH = 261.626;
	
	public C(UnitOscillator g){
		
		super(g,PITCH);
		
	}
	

}

class CKey implements KeyListener{

	public C c;
	
	@Override
	public void keyPressed(KeyEvent e) {
		Variables v = new Variables();
		switch (v.oscType) {
		case 0:
			v.osc = new SineOscillator();			
			break;

		default:
			break;
		}
		
		c = new C(v.osc);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		c.stop();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
