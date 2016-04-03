package inheritence;
class A{
	int i=10;
}
class B extends A{
	int j=11;
}
public class Demo {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		A b=new A();
		System.out.println(b.i);
	}

}
