package oops.finaltopic;

class A
{
	void test1() 
	{
		System.out.println("A---test1()");
	}
}
final class B extends A
{
	void test1() 
	{
		System.out.println("B---test1()");
	}
}
class C extends B
{
	void test1() 
	{
		System.out.println("C---test1()");
	}
}
public class TestApp3 
{
	

}
