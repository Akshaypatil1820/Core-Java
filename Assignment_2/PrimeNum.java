import java.util.*;
class PrimeNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not prime num");
				break;
			}
		}
		System.out.println("Number is prime num");
	}
}