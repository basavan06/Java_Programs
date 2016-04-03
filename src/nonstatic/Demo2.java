package nonstatic;
class C{
	int i,j;
	int getIval(int a)
	{
		return i=a;
	}
	int getJval(int b)
	{
		return j=b;
	}
	
}

public class Demo2 {
	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1.getIval(111));
	}

}
