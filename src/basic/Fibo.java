package basic;

public class Fibo {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int k;
		System.out.println(a);
		for(k=1;k<=10;k++ )
		{ 
		  k=a+b;
		  a=b;
		  b=k;
		System.out.println(k);
	}
}
}