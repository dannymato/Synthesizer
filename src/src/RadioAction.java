package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class RadioAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = ((JRadioButton) e.getSource()).getName();
		
		switch (name) {
		case "sineRad":
			
			Variables.oscType = 0;
			
			break;
		case "squareRad":
			Variables.oscType = 1;
			break;
		
		case "sawRad":
			Variables.oscType = 2;
			break;
		default:
			break;
		}
		
	}

}
