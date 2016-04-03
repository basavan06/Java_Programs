package constructor;



class A{
	A()
	{
		System.out.println("constrcutor of class A");
	}
	static
	{
		System.out.println("SIB of  A class");
	}
	{
		System.out.println("IIB of A class");
	}
	
}
public class Demo {
	static
	{
		System.out.println("SIB of  Demo class");
	}
	{
		System.out.println("IIB of Demo class");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	System.out.println("Main Starts");
	A a1=new A();
	A a2=new A();
	System.out.println("Main Ends");
	new Demo();
	}

}//here Always static block in Class will execute 1st and ,static block is executed only once 
//non static block gets executed whenever object gets created its gets copy
