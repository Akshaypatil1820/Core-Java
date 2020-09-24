import java.util.*;
class Circle
{
	private double Radius;
	private double Area;
	
	void init()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		Radius = sc.nextInt();	
	}
	
	void calculateArea()
	{
		Area = Math.PI*Radius*Radius;
	}
	
	void display()
	{
		System.out.println("radius : "+Radius);
		System.out.println("Area : "+Area);
	}
}

class CircleDemo
{
	public static void main(String args[])
	{	
		Circle c = new Circle();
		c.init();
		c.calculateArea();
		c.display();
	}
}