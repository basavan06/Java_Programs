package static_block;

public class Demo {
	static int i=20;
	public static void main(String[] args) {
		Demo.test();
	}
	 static void test() {
		System.out.println("i="+Demo.i);
		
	}

}
//to access static members we use class name & .(dot) operator along with member name