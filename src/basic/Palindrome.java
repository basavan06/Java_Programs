package basic;

import java.util.Scanner;

public class Palindrome {
   @SuppressWarnings("resource")
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Any no.to Check Palindrome= ");
   int n=sc.nextInt();
//   int n=12321;
		int rev=0;
		int rem=0;
		int s=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
			
		}
    if(s==rev)
   {
	System.out.println("numbers is palimdrome");}
	else{
		System.out.println("not palindrome");
	}}	}


