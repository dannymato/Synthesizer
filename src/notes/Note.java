package notes;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import src.Variables;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SawtoothOscillatorDPW;
import com.jsyn.unitgen.SineOscillatorPhaseModulated;
import com.jsyn.unitgen.SquareOscillatorBL;
import com.jsyn.unitgen.UnitOscillator;

public class Note implements  MouseListener, Action{
	
	private Synthesizer synth;
	private LineOut lineOut;
	private UnitOscillator osc;
	public int key = 0;
	
	
	
	public void setKey(){
		key = KeyEvent.VK_NUMPAD0;
	}
	
	public void start(UnitOscillator g, double fre){
		synth = JSyn.createSynthesizer();
		synth.add(osc = g);
		synth.add(lineOut = new LineOut());
		
		osc.frequency.set(fre);
		osc.amplitude.set(Variables.amplitude);
		
		osc.output.connect(lineOut.input);
		
		synth.start();
		lineOut.start();
					
		
	}
	
	public Note(){}
	
	public void stop(){
		synth.stop();
	}
	
	public void doStuff(){
		Variables v = new Variables();
	
		switch (Variables.oscType) {
		case 0:
			v.osc = new SineOscillatorPhaseModulated();
			break;
			
		case 1:
			v.osc = new SquareOscillatorBL();
			break;
			
		case 2:
			v.osc = new SawtoothOscillatorDPW();
			break;

		default:
			break;
		}
		
		start(v.osc,Variables.notesPits.get(this));
		
		
	}
	
	public String toString(){return this.getClass().getName().substring(6);}



	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("swag");
		doStuff();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		stop();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!Variables.isPressed.get(this)){
		System.out.println("SWAG");
		doStuff();
		Variables.isPressed.put(this, true);
		}
		else{
			stop();
			Variables.isPressed.put(this, false);
		}
			
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}


	
	
}
