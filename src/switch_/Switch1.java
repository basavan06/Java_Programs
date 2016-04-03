
package switch_;

import java.util.Scanner;

public class Switch1 {
	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter Country Code");
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input=input.toUpperCase();
		 ch=input.charAt(0);
	//	char countryCode='z';
		
		 switch(ch)
		{
		case 'I':
		System.out.println("india");
		break;
		case 'J':
		System.out.println("japan");
		break;
		default:
			System.out.println("invalid chioce");
		
		}
		
	}

}
