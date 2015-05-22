package notes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import src.Variables;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitOscillator;

public class Note implements KeyListener, MouseListener{
	
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
					
		
		
	}
	
	public Note(){}
	
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
		
		System.out.println(this);
		
		while(index < v.noteNames.length && !this.toString().equals(v.noteNames[index])){
			System.out.println(v.noteNames[index]);
			System.out.println(this.toString() == v.noteNames[index]);
			index++;
		}
		
		System.out.println(index);
		n = new Note(v.osc, v.pitches[index]);
	}
	
	public String toString(){return this.getClass().getName().substring(6);}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		

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
		doStuff();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		n.stop();
		
	}


	
	
}
