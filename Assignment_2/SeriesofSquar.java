import java.util.*;
class SeriesofSquar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,num;
		int sum=0;
		int p=0;
		
		num = sc.nextInt();
		for(i=2; i<=num; i++)
		{
			sum = ((2*i-1)*(2*i-1));
			System.out.println(sum+" ");
			p = p+sum;
		}
		System.out.println("Series sum : "+p);
	}
}
		