package frames;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Keys extends Frame implements KeyListener 
{
	TextArea ta;
	String msg="";
	
	Keys()
	{
		setLayout(new FlowLayout());
		ta= new TextArea(5, 25);
		
		Font f = new Font("SansSerif", Font.BOLD, 25);
		ta.setFont(f);
		ta.setForeground(Color.red);
		
		add(ta);
		
		ta.addKeyListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public void keyPressed(KeyEvent ke)
	{
		int keycode= ke.getKeyCode();
		msg += "\nKey code:"+keycode;
		
		String keyname= ke.getKeyText(keycode);
		msg += "\nkey pressed:"+keyname;
		
		ta.setText(msg);
	}
	public void keyTyped(KeyEvent ke)
	{ }
	public void keyReleased(KeyEvent ke)
	{
		int keycode= ke.getKeyCode();
		msg += "\nKey code:"+keycode;
		
		String keyname= ke.getKeyText(keycode);
		msg += "\nKey Released:"+keyname;
		
		ta.setText(msg);
		msg="";
	}
	public static void main(String[] args) 
	{
		Keys ks = new Keys();
		ks.setTitle("Catch the key");
		ks.setSize(400, 400);
		ks.setVisible(true);
	}
}
