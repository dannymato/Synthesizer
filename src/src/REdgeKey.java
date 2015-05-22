package src;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class REdgeKey extends JButton{
	
	public REdgeKey(String title){
		super(title);
		setBackground(Color.WHITE);
		setContentAreaFilled(false);
	}
	
	public void paintComponent(Graphics g){
		
		
		
		int height = super.getHeight();
		int width = super.getWidth();
		
		g.setColor(Color.BLACK);
		
		g.drawRect(width/2, 0, width/2, height/2);
		g.drawRect(0, height/2, width, height/2);
		
		g.setColor(Color.WHITE);
		
		g.fillRect(width/2, 0, width/2, height/2+1);
		g.fillRect(0, height/2+1, width, height/2-1);
		
		super.paintComponent(g);
		
		
	}

}
