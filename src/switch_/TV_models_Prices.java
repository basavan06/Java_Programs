package switch_;

import java.util.Scanner;

public class TV_models_Prices {
	static char ch;
	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter TV MOdel like A,B,C & get Their Prices :");
	String input=sc.nextLine();
	input=input.toUpperCase();
	ch=input.charAt(0);
	 switch(ch)
	 {
	 case 'A':
		 System.out.println("1st model Price is $300");
		 break;
	case 'B':
		 System.out.println("2nd model Price is $350");
		 break;
	 case 'C':
		 System.out.println("3rd model Price is $400");
		 break;
     default:
    	 System.out.println("Choosed an Invalid Model");

	 }
	}

}
