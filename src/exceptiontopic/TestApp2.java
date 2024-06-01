package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		try 
		{
			a[5] = 100;
		}
		finally 
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("----------General Statements----------");
	}
}
