package static_block;
class A 
{
	public static char[] a1;
	static
	{
		System.out.println("SIB of A class");//static block
	}
	{
		System.out.println("IIB of A class");//non static block
	}}
  public class Demo2 {
	static
	{
		System.out.println("SIB of Demo class");
	}
	public static void main(String[] args) {
		
	}
	{
		System.out.println("Main Starts");
		@SuppressWarnings("unused")
		A a1=new A();
		@SuppressWarnings("unused")
		A a2=new A();
		System.out.println("Mian Ends");
		System.out.println(A.a1);
	}

}  //not working
