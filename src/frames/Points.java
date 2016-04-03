package frames;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Points extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	public void pain(Graphics g)
	{
		g.setColor(Color.white);
		
		for (;;)
		{
			int x = (int) (Math.random() * 800);
			int y = (int) (Math.random() * 600);
			
			g.drawLine(x, y, x, y);
			try{
				Thread.sleep(20);
			}catch(InterruptedException ie){}			
		    }
	}
	public static void main(String[] args) 
	{
		Points obj = new Points();
		obj.setBackground(Color.black);
		obj.setSize(500, 400);
		obj.setTitle("Random dots");
		obj.setVisible(true);
	}
}
