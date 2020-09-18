class PrimitiveData
{
	public static void main(String a[])
	{
		   // Condition A
		//int x = 2;
		//int y = (Integer)x*x + 3*x -7;
		//System.out.println(y);
		
		  // Condition B
		//int y = (Integer)(x++) + (++x);
		//System.out.println(y);
		//System.out.println(x);
		
		  // Conditon C
		//int y = 3;
		//int z = (Integer) (x++) - (--y) - (--x) + (x++);
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		
		  // condition D
	    boolean z;
        boolean x = true;
        boolean y = false;
		z = x && y || !(x || y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}