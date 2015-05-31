package src;

import java.util.HashMap;
import java.util.Map;

import notes.Note;

import com.jsyn.unitgen.UnitOscillator;

public class Variables {
	
	public static final String[] noteNames = {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B","MC","MDb","MD","MEb",
			"ME","MF","MGb","MG","MAb","MA","MBb","MB","HC"};
	
	public static final double[] pitches = {
		261.626,
		277.183,
		293.665,
		311.127,
		329.628,
		349.228,
		369.994,
		391.995,
		415.305,
		440,
		466.164,
		493.883,
		523.251,
		554.365,
		587.33,
		622.254,
		659.255,
		698.456,
		739.989,
		783.991,
		830.609,
		880,
		932.328,
		987.767,
		1046.5};
	
	public UnitOscillator osc;
	
	public static Map<Note, Double> notesPits = new HashMap<Note,Double>();
	
	public static Map<Note, Boolean> isPressed = new HashMap<Note, Boolean>();
	
	public static int oscType = 0;
	
	public static double amplitude = 1.0;
	
	public static Note[] notes = new Note[25];
	
	public Variables(){
		for(int i = 0; i < pitches.length; i++){
			notesPits.put(notes[i], pitches[i]);
		}
		
		for(int i = 0; i < notes.length; i++){
			notes[i] = new Note();
			isPressed.put(notes[i], false);
		}
	}
}
