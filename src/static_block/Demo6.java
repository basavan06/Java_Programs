package static_block;
class B
{
	static{
		System.out.println("SIB of A class");
	}
	{
		System.out.println("IIB of A class");
	}
}
public class Demo6 {
	static{
		System.out.println("SIB of Demo6");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		new B();
		new B();
		
	}

}
