import java.util.*;
class Gender
{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		char sex = sc.next().charAt(0);
		
		if (sex == 'f' || sex == 'F')
		{
			if (age > 18)
			{
				System.out.println("eligible for marriage");
			}
			else
			{
				System.out.println("not eligible for marriage");
			}
		}
		
		if (sex == 'm' || sex == 'M')
		{
			if (age > 25)
			{
				System.out.println("eligible for marriage");
			}
			else
			{
				System.out.println("not eligible for marriage");
			}
		}
		
	}
}
		
		