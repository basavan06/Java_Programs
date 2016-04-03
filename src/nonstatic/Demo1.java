package nonstatic;
class A
  {
	int i;
	}
public class Demo1 {
public static void main(String[] args) {
	A a1=new A();
	a1.i=10;
	A a2=new A();
	a2.i=20;
}
}
