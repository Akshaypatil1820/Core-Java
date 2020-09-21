class TwodArray
{
    public static void main(String args[])
	{
        int a1[]= {2,3,4};
        int a2[]= {5,6,7};
        int a3[]= {8,9,3};
       
	   int counter=0;
	   
        int arr[][]= new int[3][];
        arr[0]=a1;
        arr[1]=a2;
        arr[2]=a3;
      
        System.out.println("Total element of one-D =");
        for ( int i=0; i< arr.length; i++)
        {
			counter++;
            for( int j=0; j< arr[i].length; j++)
			{
				System.out.print(" "+ arr[i][j]);
			}
        }
           System.out.println("  ");
		   
		   int l = a1.length;
		   System.out.println(l+" element present in every one D array");
		   System.out.println("Total number of one D array is :"+counter);
    }
}
