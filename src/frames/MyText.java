package frames;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyText extends Frame implements ActionListener
{
	TextField name,pass;
	
	MyText()
	{
		setLayout(new FlowLayout());
		
		Label n = new Label("Name:", Label.LEFT);
		Label p = new Label("Pass word:", Label.LEFT);
		
		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('*');
		
		name.setBackground(Color.green);
		name.setForeground(Color.blue);
		Font f = new Font("Arial", Font.PLAIN,25);
		name.setFont(f);
		
		add(n);
		add(name);
		add(p);
		add(pass);
		
		name.addActionListener(this);
		pass.addActionListener(this);
		
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
		Graphics g = this.getGraphics();
		
		g.drawString("Name:"+name.getText(), 10, 200);
		g.drawString("Pass word:"+pass.getText(), 10, 240);
			
	}
	public static void main(String[] args) 
	{
		MyText mt = new MyText();
		mt.setTitle("My text field");
		mt.setSize(400, 400);
		mt.setVisible(true);
	}
}
