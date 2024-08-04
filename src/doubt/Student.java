package doubt;

public class Student 
{
	int rno;
	String name;
	int std;
	
	private static Student  s = null;
	
	// Singleton Design Pattern
	private Student() 
	{
	}
	public static Student getInstance() 
	{
		if(s == null) 
		{
			s = new Student();
		}
		return s;
	}
}
