package notes;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import src.Variables;

public class NoteOff implements Action{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(Variables.isPressed.get(Variables.actionMap.get(this))){
		System.out.println("test");
		Variables.actionMap.get(this).stop();
		Variables.isPressed.put(Variables.actionMap.get(this),false);
		}
		
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
