package basic;

import org.testng.annotations.Test;

public class Palindrome_Without_Scan {
	@Test
	public void test()
	{
		int n=12321;
		int rem=0;
		int rev=0;
		int s=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(s==rev)
		{
			System.out.println("no.is Palindrome");
		}
		else
		{
			System.out.println("no.is not palindrome");
		}
	}

}
