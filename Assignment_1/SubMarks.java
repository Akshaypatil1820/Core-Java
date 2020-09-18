import java.util.*;
class SubMarks
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;
		System.out.println("enter the marks of DS");
		int ds = sc.nextInt();
		System.out.println("enter the marks of DB");
		int db = sc.nextInt();
		System.out.println("enter the marks of CPP");
		int cpp = sc.nextInt();
		System.out.println("enter the marks of anguler");
		int ang = sc.nextInt();
		System.out.println("enter the marks of AWP");
		int awp = sc.nextInt();
		
		int sum = ( ds + db + cpp + ang + awp);
		int average = sum/5;
		double percentage = (sum*100)/500;
		
		System.out.println("sum of 5 sub :" +sum);
		System.out.println("Average of 5 sub :" +average);
		System.out.println("percentage obtained is :" +percentage+ "%");
	}
}