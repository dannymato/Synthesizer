package src;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.UnitOscillator;

public class Db {
	
	private Synthesizer synth;
	private LineOut lineOut;
	private UnitOscillator osc;
	
	private final double PITCH = 277.183;
	
	public Db(UnitOscillator g){
		synth = JSyn.createSynthesizer();
		synth.add(osc = g);
		synth.add(lineOut = new LineOut());
		
		osc.frequency.set(PITCH);
		osc.amplitude.set(1.0);
		
		osc.output.connect(lineOut.input);
		
		synth.start();
		lineOut.start();
		
		try {
			synth.wait(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stop();
	}
	
	public void stop(){
		lineOut.stop();
	}

}
