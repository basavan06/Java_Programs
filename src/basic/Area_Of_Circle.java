package basic;

public class Area_Of_Circle {
	public static void main(String[] args) {
		System.out.println("getAreaofCicrle(5.5)");
	}
	static double getAreaofCicrle(double rad)
	{
		final double PI=3.14;
		double area=PI*rad*rad;
		return area;
	}

}
