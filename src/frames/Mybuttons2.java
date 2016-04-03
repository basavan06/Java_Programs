package frames;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mybuttons2 extends Frame implements ActionListener 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3;
	Button b1, b2, b3, b4;
	
	Mybuttons2()
	{
		setLayout(new FlowLayout());
		 
		b1 = new Button("Yellow");
		b2 = new Button("Blue");
		b3 = new Button("Red");
		b4 = new Button("Orange");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1) setBackground(Color.yellow);
		if(ae.getSource() == b2) setBackground(Color.blue);
		if(ae.getSource() == b3) setBackground(Color.red);
		if(ae.getSource() == b4) setBackground(Color.orange);
		
	}
	public static void main(String[] args) {
		Mybuttons2 mb = new Mybuttons2();
		mb.setSize(400, 400);
		mb.setTitle("My buttons");
		mb.setVisible(true);
	}
}
