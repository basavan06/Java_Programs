package strings;

public class Reverse_String {
 public static void main(String[] args) {
	String s="Hello";
	char arr[]=s.toCharArray();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]);
	}
	System.out.println();
	String s1=new String("pruthvy");
	StringBuffer sb=new StringBuffer(s1);
	System.out.print(sb.reverse());
	sb.reverse();
}


}
