package frames;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame23 extends Frame implements ActionListener
{
	Button b1, b2;
	Frame23()
	{
		setLayout(null);
		
		b1= new Button("Next");
		b2= new Button("Close");
		
		b1.setBounds(100, 100, 70, 40);
		b2.setBounds(200, 100, 70, 40);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			Frame24 f3 = new Frame24();
			f3.setSize(400, 400);
			f3.setVisible(true);
		}
		else {
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Frame23 f3 = new Frame23();
		f3.setSize(500, 500);
		f3.setTitle("First frame");
		f3.setVisible(true);
	}
}