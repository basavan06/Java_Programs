package frames;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Myscroll extends Frame implements AdjustmentListener
{
	String msg="";
	Scrollbar s1;
	
	Myscroll()
	{
		setLayout(null);
		s1 = new Scrollbar(Scrollbar.VERTICAL, 0, 30, 0, 400);
		
		s1.setBounds(250, 50, 30, 200);
		
		add(s1);
		
		s1.addAdjustmentListener(this);
		
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
		g.drawString("SCROLLBAR POSITION:", 20, 150);
		msg += s1.getValue();
		g.drawString(msg, 20, 180);
	}
	public static void main(String[] args) 
	{
		Myscroll ms = new Myscroll();
		ms.setTitle("My scroll bar");
		ms.setSize(400, 400);
		ms.setVisible(true);
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
