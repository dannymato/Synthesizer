package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class RadioAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = ((JRadioButton)(e).getSource()).getName();
		
		switch (name) {
		case "sine":
			Variables.oscType = 0;
			break;
		case "square":
			Variables.oscType = 1;
			break;
		case "saw":
			Variables.oscType = 2;
			break;
		default:
			break;
		}
		
		System.out.println(name);
		
	}

}
