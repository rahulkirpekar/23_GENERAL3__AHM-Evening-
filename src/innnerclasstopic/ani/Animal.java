package innnerclasstopic.ani;

public class Animal
{
	public static void main(String[] args) 
	{
		A obj = new A() 
		{
			@Override
			public void test1() 
			{
				//innnerclasstopic.ani.TestApp1$1@372f7a8d
				System.out.println("A :: Test1---" + this);
			}
		};
		obj.test1();
	}
}
