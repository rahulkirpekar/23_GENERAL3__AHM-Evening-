package exceptiontopic.methodoverriddeexcep;

import java.io.IOException;

//Exception Handling with Method Overriding in Java
//-----------------------------------------------------
//class A
//{
//	public void test() 
//	{
//
//	}
//}
//class B extends A
//{
//	public void test() throws Arith
//	{
//
//	}
//}


//If the superclass method does not declare an exception
//========================================================
//
//	===> subclass overridden method cannot declare the checked exception 
//	     but it can declare unchecked exception.
//
//
//If the superclass method declares an exception
//================================================
//
//	===> subclass overridden method can declare same, 
//	===> subclass exception or 
//	===> no exception 
//	===> but cannot declare parent exception.




public class B extends A
{
	@Override
	public void test()  
	{
		System.out.println("B : test()");
	}
}
