package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

/*
 * ===> throw :-
---------------
===> throws:-
---------------
===> Custom Exception(User Defined Exception)
===> Method Overridding With Exception
 * 
 * 
 */


public class TestApp3 
{
					//							 // pass on / declare
	public static void isValidForVote(int age) throws InvalidAgeForVoteException
	{
		if(age < 18) 
		{
			// raise custom-exception
			throw new InvalidAgeForVoteException("\n\t\"Invalid age,\n\t\tPlease enter age above 18\"");

		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeForVoteException e) 
		{
			e.printStackTrace();
		}
		
//		try 
//		{
//			isValidForVote(age);
//		} catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
		System.out.println("Main method---line no----31");
		//....
		//....		
		//....
	}		
}
