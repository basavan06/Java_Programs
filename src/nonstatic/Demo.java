package nonstatic;

public class Demo {
int i=10;
public static void main(String[] args) {
	Demo d=new Demo();
	System.out.println(d.i);
	d.print();
}
void print()
{
	System.out.println("print() method:"+i);
	disp();
	}
void disp()
{
	System.out.println("disp");}
}
