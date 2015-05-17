package notes;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.UnitOscillator;

public class Note {
	
	private Synthesizer synth;
	private LineOut lineOut;
	private UnitOscillator osc;
	
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
	
	public String toString(){return this.getClass().getName();}
	
	
}
