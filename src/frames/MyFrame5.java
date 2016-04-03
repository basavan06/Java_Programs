package frames;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5 extends Frame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4;

	public static void main(String[] args) 
	{
		MyFrame5 f = new MyFrame5();
		
		f.setTitle("My AWT frame");
		
		f.setSize(1024, 768);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
