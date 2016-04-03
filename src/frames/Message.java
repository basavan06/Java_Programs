package frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Message extends Frame
{
	Message()
	{
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		this.setBackground(new Color(100, 20, 20));
		
		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		
		g.setColor(Color.green);
		
		g.drawString("Hello, How are U?", 100, 100);
		
	}
	public static void main(String[] args) 
	{
		Message m = new Message();
		m.setSize(400, 300);
		m.setTitle("This is my text");
		m.setVisible(true);
	}
}
