package frames;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mychoice extends Frame implements ItemListener 
{
	String msg;
	Choice ch;
	Mychoice()
	{
		setLayout(new FlowLayout());
		
		ch = new Choice();
		
		
		ch.add("English");
		ch.add("Telugu");
		ch.add("Kannada");
		ch.add("Hindi");
		ch.add("French");
		
		add(ch);
		
		ch.addItemListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("selected language:", 10, 100);
		msg = ch.getSelectedItem();
		g.drawString(msg, 10, 120);
	}
	
	public static void main(String[] args) 
	{
		Mychoice mc = new Mychoice();
		mc.setTitle("My choice box");
		mc.setSize(400, 350);
		mc.setVisible(true);
	}
}
