package notes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import src.Variables;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitOscillator;

public class Note implements KeyListener, ActionListener{
	
	private Synthesizer synth;
	private LineOut lineOut;
	private UnitOscillator osc;
	private Note n;
	
	public Note(UnitOscillator g, double fre){
		synth = JSyn.createSynthesizer();
		synth.add(osc = g);
		synth.add(lineOut = new LineOut());
		
		osc.frequency.set(fre);
		osc.amplitude.set(1.0);
		
		osc.output.connect(lineOut.input);
		
		synth.start();
		lineOut.start();
					
		
		stop(); 
	}
	
	public void stop(){
		synth.stop();
	}
	
	public void doStuff(){
		Variables v = new Variables();
		switch (v.oscType) {
		case 0:
			v.osc = new SineOscillator();			
			break;

		default:
			break;
		}
		
		int index = 0;
		
		while(this.toString() != v.noteNames[index])
			index++;
		n = new Note(v.osc, index);
	}
	
	public String toString(){return this.getClass().getName();}

	@Override
	public void keyPressed(KeyEvent e) {

		doStuff();
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		n.stop();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		doStuff();
		
	}


	
	
}
