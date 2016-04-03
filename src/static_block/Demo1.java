package static_block;

public class Demo1 {
	int i=100;
 public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println("i="+d.i);
		d.print();
	}
void print() {
	System.out.println("print() method:"+i);
	disp();
	
}
private void disp() {
	System.out.println("disp method()");
}

}
//to access non static members we use refernce varible &.(dot) opertaor along with member name