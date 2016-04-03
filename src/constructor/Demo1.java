package constructor;
class c{
	int i;
	c(int a){
		System.out.println("constructor of class C");
		i=a;
	}
}
public class Demo1 {
	public static void main(String[] args) {
		{
			c c1=new c(100);
			System.out.println("i="+c1.i);
			c c2=new c(200);
			System.out.println("i="+c2.i);
		}
	}

}
