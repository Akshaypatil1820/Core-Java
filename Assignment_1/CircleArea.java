import java.util.Scanner;
class CircleArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		int r = sc.nextInt();
		Double a = Math.PI*(r*r);
		Double c = Math.PI*(2*r);
		System.out.println("Area of circle = " +a);
		System.out.println("circumference of circle = " +c);
	}
}
		