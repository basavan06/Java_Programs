package basic;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	System.out.println("enter");
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);

	}

}
