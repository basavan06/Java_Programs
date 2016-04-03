package frames;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame4 extends Frame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3;

	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
		
		f.setTitle("My AWT frame");
		
		f.setSize(1024, 768);
		
		f.setVisible(true);
		
		f.addWindowListener(new Myclass());
		
	}
}
class Myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}