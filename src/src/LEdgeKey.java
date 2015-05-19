package src;

import java.awt.Graphics;

import javax.swing.JButton;

public class LEdgeKey extends JButton{
	
	public LEdgeKey(String title){
		super(title);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int height = super.getHeight();
		int width = super.getWidth();
		
		g.drawRect(0, 0, height/2, width/2);
		g.drawRect(0, height/2, width, height/2);
		
		
	}

}
