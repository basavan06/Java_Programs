package basic;

import java.util.Scanner;

public class Electric_Bill 
{
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int unit;
		double arrear,amount=0,discount=0,fine=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Arrear Value :");
		unit=sc.nextInt();
		if(unit<50)
		amount=unit*1.2;
		else 
		if(unit>50&&unit<100)
		amount=50*1.2+(unit-50)*2.4;
		System.out.println(amount);
	}

}
