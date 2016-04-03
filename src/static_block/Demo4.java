package static_block;

public class Demo4 {
static
{
	System.out.println("3");
	}
static{
	System.out.println("1");
}
public static void main(String[] args) {
	System.out.println("main Starts");
	System.out.println("main ends");
}
static
{
	System.out.println("2");}
}
