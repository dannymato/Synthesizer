package src;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.Delay;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.TriangleOscillator;
import com.jsyn.unitgen.UnitFilter;
import com.jsyn.unitgen.UnitOscillator;

public class Synth {

	private Synthesizer synth;
	private UnitOscillator osc;
	private LineOut lOut;
	
	public Synth(double pitch){
		synth = JSyn.createSynthesizer();
		
		synth.add(osc = new TriangleOscillator());
		synth.add(lOut = new LineOut());

		osc.frequency.set(pitch);
		osc.amplitude.set(1);
		
		osc.output.connect(lOut.input);
		
		synth.start();
		lOut.start();
		
		try {
			synth.sleepFor(.5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synth.stop();
		
	}
}
