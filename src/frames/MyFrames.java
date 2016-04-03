package frames;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrames extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2;

	public static void main(String[] args) 
	{
		MyFrames f = new MyFrames();
		
		f.setTitle("My AWT frame");
		
		f.setSize(1024, 768);
		
		f.setVisible(true);
		
		f.addWindowListener(new Myclass());
		
	}
}
class Myclass implements WindowListener
{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void wondowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}