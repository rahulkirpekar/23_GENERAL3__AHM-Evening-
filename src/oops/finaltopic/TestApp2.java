package oops.finaltopic;

public class TestApp2 
{
	final int no1;
	
	public TestApp2() 
	{
		no1 = 100;
	}
	public TestApp2(int no1) 
	{
		this.no1 = no1;
	}
	
	public static void main(String[] args) 
	{
		TestApp2 obj = new TestApp2(200);
		
		System.out.println("obj.no1 : "+obj.no1);
	}
}
