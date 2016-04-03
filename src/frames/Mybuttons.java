package frames;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mybuttons extends Frame implements ActionListener
{
	Button b1, b2, b3, b4;
	
	Mybuttons()
	{
		this.setLayout(null);
		
		b1 = new Button("Yellow");
		b2 = new Button("Blue");
		b3 = new Button("Red");
		b4 = new Button("Orange");
		
		b1.setBounds(100, 100, 70, 40);
		b2.setBounds(100, 160, 70, 40);
		b3.setBounds(100, 220, 70, 40);
		b4.setBounds(100, 360, 70, 40);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
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
		String str= ae.getActionCommand();
		
		if(str.equals("Yellow")) this.setBackground(Color.yellow);
		if(str.equals("Blue")) this.setBackground(Color.blue);
		if(str.equals("Red")) this.setBackground(Color.red);
		if(str.equals("Orange")) this.setBackground(Color.orange);
	}
	public static void main(String[] args) 
	{
		Mybuttons mb = new Mybuttons();
		mb.setSize(400, 400);
		mb.setTitle("My buttons");
		mb.setVisible(true);
	}
}
