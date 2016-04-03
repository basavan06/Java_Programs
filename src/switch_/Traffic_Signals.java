package switch_;

import java.util.Scanner;

public class Traffic_Signals {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char ch;
		System.out.println("Eneter A valid color code");
		Scanner sc=new Scanner(System.in);
		String color=sc.nextLine();
		color=color.toLowerCase();
		ch=color.charAt(0);
		
		switch(ch)
		{
			case 'g':
				System.out.println("proceed");
				break;
			case 'r':
			System.out.println("stop");
			break;
		}
		
	}

}
