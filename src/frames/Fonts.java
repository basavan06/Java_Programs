package frames;

import java.awt.GraphicsEnvironment;

public class Fonts 
{
	public static void main(String[] args) 
	{
		GraphicsEnvironment ge =
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		String fonts[] = ge.getAvailableFontFamilyNames();
		
		System.out.println("Availble fonts on this system:");
		for(int i=0; i<fonts.length; i++)
		System.out.println(fonts[i]);
	}

}
