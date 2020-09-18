class AllPrimeNum
{
	public static void main(String args[])
	{
		int a=10;
		int b=50;
		
		
		for(int x=a; x<=b; x++)
		{
			boolean flag = false;
			for(int i=2; i<=x/2; i++)
			{
				if(x%i==0)
				{
					flag = true;
					break;
				}
			}
			if(!flag && a!=0 && a!=1)
			{
				System.out.println(x);
			}
		}
	}
}
				