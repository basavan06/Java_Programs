package frames;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mylist extends Frame implements ItemListener 
{
	int[] msg;
	List lst;
	
	Mylist()
	{
		setLayout(new FlowLayout());
		lst = new List(4, true);
		
		lst.add("English");
		lst.add("Telugu");
		lst.add("Kannada");
		lst.add("hindi");
		lst.add("French");
		
		add(lst);
		
		lst.addItemListener(this);
		
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
		g.drawString("Selected languages:", 100, 200);
		msg = lst.getSelectedIndexes();
		for(int i=0; i<msg.length; i++)
		{
			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 220+i*20);
		}
	}
	public static void main(String[] args) 
	{
		Mylist ml = new Mylist();
		ml.setTitle("my list box");
		ml.setSize(400, 400);
		ml.setVisible(true);
	}
}
