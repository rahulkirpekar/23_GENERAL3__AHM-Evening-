package oops.classobject;

import java.util.Scanner;

public class Student 
{
	// 1) Data  Members
	int rno;
	String name;
	int std;
	
	// 2) Member Function
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name + " " +std);
	}
	public static void main(String[] args) 
	{
//		Student s1 = new Student(),s2 = new Student(), s3 = new Student(), s4 = new Student(),
//		s5 = new Student();
		
		Student s[] = new Student[5];

		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i = 0 ; i < s.length ; i++) 
		{
			s[i].dispData();
		}
		
		
//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		s4.scanData();
//		s5.scanData();
//		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();
//		s5.dispData();
		// s- reference variable(pointer variable)
		// new - Keyword--(object creation --JVM)
//		Student--object[rno name std]
	}
}
