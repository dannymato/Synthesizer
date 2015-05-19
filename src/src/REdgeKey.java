package src;

import java.awt.Graphics;

import javax.swing.JButton;

public class REdgeKey extends JButton{
	
	public REdgeKey(String title){
		super(title);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		int height = super.getHeight();
		int width = super.getWidth();
		
		g.drawRect(width/2, 0, height/2, width/2);
		g.drawRect(0, height/2, width, height/2);
		
		
	}

}
