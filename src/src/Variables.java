package src;

import com.jsyn.unitgen.UnitOscillator;

public class Variables {
	
	public static final String[] noteNames = {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","B","MC","MDb","MD","MEb",
			"ME","MF","MGb","MG","MAb","MA","MBb","MB","HC"};
	
	public static final double[] pitches = {261.626,277.183,293.665,277.183,293.665,311.127,329.628,349.228,369.994,391.995,415.305
			,440,466.164,493.883,523.251,554.365,5877.33,622.254,659.255,698.456,739.989,783.991,830.609,880,932.328,987.767,1046.5};
	
	public UnitOscillator osc;
	
	public static int oscType = 0;
}
