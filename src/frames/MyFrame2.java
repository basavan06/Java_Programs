package frames;

import java.awt.Frame;

public class MyFrame2 extends Frame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	MyFrame2(String str)
	{
		super(str);
	}
	public static void main(String[] args) 
	{
		MyFrame2 f = new MyFrame2("My AWT frame");
		
		f.setSize(1024, 768);
		
		f.setVisible(true);
		
	}
}
