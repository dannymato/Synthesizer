package src;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderAction implements ChangeListener{

	@Override
	public void stateChanged(ChangeEvent e) {
		
		JSlider s = (JSlider)e.getSource();
		
		if(!s.getValueIsAdjusting()){
			Variables.amplitude = s.getValue()/100.0;
		}
	}
	
	

}
