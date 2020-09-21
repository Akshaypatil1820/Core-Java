class ArrayGreatestSmallest
{
	public static void main(String arsg[])
	{
		int arr[] = {10,2,3,4,5,6};
		  int smallest = arr[0];
          int biggest = arr[0];
		  
		for(int i=1; i<arr.length; i++)
		{
			 if(arr[i] > biggest)
			 {
				 biggest = arr[i];
			 }
             else if (arr[i] < smallest)
			 {
                 smallest = arr[i];
			 }
		}
		System.out.println("number is small : "+smallest);
		System.out.println("number is larger : "+biggest);
	}
}