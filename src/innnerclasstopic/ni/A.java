package innnerclasstopic.ni;

public class A 
{
	private static int no1=100;
	
	// Nested Inner Class
	static class B
	{
		void msg() 
		{
			System.out.println("No1 : " +  no1);
		}
	}
	public static void main(String[] args) 
	{
		A.B obj = new A.B();	
		
		obj.msg();
	}
}
