package frames;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame24 extends Frame implements ActionListener
{
	Button b;
	
	Frame24()
	{
		setLayout(new FlowLayout());
		
		b= new Button("Back");
		
		add(b);
		
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
}
