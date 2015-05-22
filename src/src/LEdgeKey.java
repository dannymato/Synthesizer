package src;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class LEdgeKey extends JButton{
	
	public LEdgeKey(String title){
		super(title);
		setBackground(Color.WHITE);
		
		setContentAreaFilled(false);
	}
	
	public void paintComponent(Graphics g){
				
		int height = getHeight();
		int width = getWidth();
		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, width/2, height/2);
		g.drawRect(0, height/2, width, height/2);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width/2, height/2+1);
		g.fillRect(0, height/2+1, width, height/2-1);
		
		
		
		super.paintComponent(g);
	}

}
