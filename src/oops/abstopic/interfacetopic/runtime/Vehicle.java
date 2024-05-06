package oops.abstopic.interfacetopic.runtime;

public interface Vehicle 
{
	// 1) Constant Variables--[public static final]
		int NO = 100 ;// Compiler

		// 2) Abstract methods---[public abstract]
		public abstract void test1();
		public abstract void test2();
		void getSpec(); //public abstract 


		// 3) Non-Abstract methods--java-8[default(8th),static(8th),private(9th)]

		default void test3()
		{
			// operation part
//			test5();
//			other code;
//			test5();
//			other code;
//			test5();
//			other code;
			test5();
			System.out.println("Vehicle---default---test4()");

		}
		static void test4()
		{
			// operation part
			System.out.println("Vehicle---static---test4()");
		}
		private void test5()
		{
			// operation part
			System.out.println("Vehicle---private---test5()");
		}
}
