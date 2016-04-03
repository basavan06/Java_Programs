package frames;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Draw1 extends Frame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7;
	Draw1()
	{
		
	this.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	});
	
}
public void paint(Graphics g)
{
g.setColor(Color.blue);

g.drawRect(40, 40, 200, 200);

 g.drawOval(90, 70, 80, 80);
 
 g.drawOval(110, 95, 5, 5);
 g.drawOval(145, 95, 5, 5);
 
 g.drawLine(130, 95, 130, 115);
 g.drawArc(113, 115, 35, 20, 0, -180);
 
}
public static void main(String[] args) 
{
	Draw1 d = new Draw1 ();
	
	d.setSize(1024, 768);
	d.setTitle("My drawing");
	
	d.setVisible(true);
}
}
