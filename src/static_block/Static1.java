package static_block;

public class Static1 {
	static
	{
		System.out.println("3");
	}
	static
	{
		System.out.println("1");
	}
	public static void main(String[] args)
	 {
		System.out.println("Main Starts");
			System.out.println("Main Ends");
		}
	static
	{
		System.out.println("2");
	}

}
// static blocks will always before the main method