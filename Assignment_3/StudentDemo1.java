class Student
{
	private int RollNo;
	private String Name;
	
	static int counter=0;

	void setData(int x, String y)
	{
		RollNo = x;
		Name = y;
	}
	
	void show()
	{
		System.out.println(RollNo+ " "+Name);
		counter++;
        System.out.println("no of student object ="+counter);
	}
}
	
class StudentDemo1
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setData(100, "akshay");
		s.show();
		Student s1 = new Student();
		s1.setData(101, "sumedh");
		s1.show();
		
	}
}