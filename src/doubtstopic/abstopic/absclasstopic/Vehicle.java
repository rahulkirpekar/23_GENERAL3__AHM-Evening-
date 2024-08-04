package doubtstopic.abstopic.absclasstopic;

//Abstraction|------------------------------------||1)0%to 100%2)100%--------------- ---------------Abstract
//class Interface(pure abstraction)
//
//Vehicle(void getSpec())
//|
//-------------------------------
//|		  |		|
//TwVehicle     LmvVehicle     HmvVehicle	
//getSpec()     getSpec()
//
//Interface(pure abstraction):-
//-------------------------------

public interface Vehicle 
{
		// 1) Constant Variable
		static int no = 10;// public static final

		// 2) abstract methods
		void getSpec();// public abstract
		
		//Java-8
		// 3) static method
		public static void test2()
		{
		}
// 4) default method
		public default void test3() 
		{
			test4();
//			other code;
			test4();
//			other code;
			test4();
//			other code;
			test4();
		}

//java 9 
// 5) private method
		private void test4() 
		{
		}
}

//---------------------------------------
//// abstract class
//public abstract class Vehicle 
//{
//	// 1) Dm's
//	// 2) abstract method
//	abstract void getSpec();
//	// 3) Nonabstract method
//}
