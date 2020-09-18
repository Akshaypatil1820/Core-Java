import java.util.*;
class MonthYearDay
{
	public static void main(String args[])
	{
		int A, year, days, week;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		A = sc.nextInt();
		
		year = A / 365;
		A = A % 365;
		System.out.println("No. of years:"+year);
		
		week = A / 7;
        A = A % 7;
        System.out.println("No. of weeks:"+week);
		
        days = A;
        System.out.println("No. of days:"+days);
	}
}