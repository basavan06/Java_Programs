package static_block;

import org.testng.annotations.Test;

public class Demo3 {
	static int i=20;
	@Test
public static void  testA(){
	Demo3.test();
	
}
static void test() 

{
	System.out.println(Demo.i);
	}
}
