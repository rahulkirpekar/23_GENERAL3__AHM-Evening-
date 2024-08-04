package innnerclasstopic.li;

public class A 
{
	private int no = 100;

	void disp()
	{
		// Local Inner class
		class B
		{
			void show() 
			{
				System.out.println("No : " + no);
			}
		}
		B obj = new B();
		obj.show();
	} 
	public static void main(String[] args) 
	{
		A obj = new A();

		obj.disp();
	}
}
