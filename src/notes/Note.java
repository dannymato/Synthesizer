package notes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import src.GUI;
import src.Variables;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SawtoothOscillator;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.SquareOscillator;
import com.jsyn.unitgen.UnitOscillator;

public class Note implements KeyListener, MouseListener{
	
	private Synthesizer synth;
	private LineOut lineOut;
	private UnitOscillator osc;
	private Note n;
	public int key = 0;
	
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
	
	public void setKey(){
		key = KeyEvent.VK_NUMPAD0;
	}
	
	public Note(){}
	
	public void stop(){
		synth.stop();
	}
	
	@SuppressWarnings("static-access")
	public void doStuff(){
		Variables v = new Variables();
		int i =0;
		
		if(GUI.sineRad.isSelected())
			i = 0;
		else if(GUI.squareRad.isSelected())
			i = 1;
		else if(GUI.sawRad.isSelected())
			i = 2;
		
		switch (i) {
		case 0:
			v.osc = new SineOscillator();
			break;
			
		case 1:
			v.osc = new SquareOscillator();
			break;
			
		case 2:
			v.osc = new SawtoothOscillator();
			break;

		default:
			break;
		}
		
		int index = 0;
		
		
		
		while(index < v.noteNames.length && !this.toString().equals(v.noteNames[index]))
			index++;
		
		n = new Note(v.osc, v.pitches[index]);
	}
	
	public String toString(){return this.getClass().getName().substring(6);}

	@Override
	public void keyPressed(KeyEvent e) {
		
		setKey();
		
		System.out.println("swag");
			
		int key = e.getKeyCode();
		if(key == this.key)
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
