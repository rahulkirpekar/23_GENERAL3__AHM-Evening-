package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Statement------1");
			System.out.println("Statement------2");
			System.out.println("Statement------3");
			System.out.println("Statement------4");
			System.out.println("Statement------5");
			
			System.out.println("Enter No1 : ");
			int no1 = sc.nextInt();
			System.out.println("Enter No2 : ");
			int no2 = sc.nextInt();
			
//				no1 / no2----class---bind----ArithmeticException(class)--jvm--object
//										     --------------
//											   |
//										       "code-crashed"		
			int ans = 0;
					
			try 
			{
				// Nested try..catch
				try 
				{
					
					ans = no1 / no2;// JVM---AE--create object----assign to e(reference variable)
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				try 
				{
					
					String name = null;
					System.out.println("name.length() : " + name.length());
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}

				try 
				{
					
					int a[] = new int[5];
					a[5] = 100;
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}

				
			}catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Catch Block Handled ---Exception---"+e.getClass().getName());
				e.printStackTrace();
				
			}catch (Exception e) 
			{
				System.out.println("Catch Block Handled ---Exception---"+e.getClass().getName());
				e.printStackTrace();
			} 
			
			System.out.println("Ans : "+ans);
			
			System.out.println("Statement------6 ");
			System.out.println("Statement------7 ");
			System.out.println("Statement------8 ");
			System.out.println("Statement------9 ");
			System.out.println("Statement------10");
			
			

//			String name = null;
//			System.out.println(name.length());// NullPointerException

//		int a[] = new int[5];//A[0]..a[4]
//		a[5] = 100;// ArrayIndexoutofBoundException
			
		
		
//		String name = "royal";
//		System.out.println(name.charAt(name.length()));
		
		
//		String value = "3243dsf3245";

		  // NumberFormateException	
//		int no1 = Integer.parseInt(value);//123
		
		
	}
}
