package doubt;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student obj1 = Student.getInstance();
		Student obj2 = Student.getInstance();
		Student obj3 = Student.getInstance();
		Student obj4 = Student.getInstance();
		Student obj5 = Student.getInstance();

		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		System.out.println("obj4 : " + obj4);
		System.out.println("obj5 : " + obj5);
		
	}
}
