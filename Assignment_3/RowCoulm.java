class RowCoulm
{
	public static void main(String args[])
	{
		  int[][]arr =
      {
         { 10, 20, 30 ,40}, { 40, 50, 60 ,70}, { 70, 80, 90 ,100},
         { 11, 21, 31,32 }, { 11, 0,0,0}
      };
        
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" " );
		}
	}
}