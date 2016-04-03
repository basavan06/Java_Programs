package frames;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Images extends Frame 
{
	static Image  img;
	Images()
	{
		img=Toolkit.getDefaultToolkit().getImage("diamonds.gif");
		
		MediaTracker track = new MediaTracker(this);
		
		track.addImage(img,0);
		try{
			track.waitForID(0);
			
		}catch(InterruptedException ie){}
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 50, 50, null);
		
	}
	public static void main(String[] args) 
	{
		Images i = new Images();
		
		i.setSize(500, 400);
		i.setTitle("My images");
		
		i.setIconImage(img);
		
		i.setVisible(true);
	}
}
