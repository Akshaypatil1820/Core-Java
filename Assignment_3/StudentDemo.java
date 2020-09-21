class Student
{
	private int RollNo;
	private String Name;
	
	void setData(int x, String y)
	{
		RollNo = x;
		Name = y;
	}
	
	void show()
	{
		System.out.println(RollNo+ " "+Name);
	}
}
		

class StudentDemo
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setData(100, "akshay");
		s.show();
	}
}