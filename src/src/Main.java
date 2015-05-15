package src;

import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitOscillator;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		//Synth s = new Synth(440.0);
		
		
		UnitOscillator s1 = new SineOscillator();
		UnitOscillator s2 = new SineOscillator();
		UnitOscillator s3 = new SineOscillator();
		
		C c = new C(s1);
		Db db = new Db(s2);
		D d = new D(s3);
	}
}
