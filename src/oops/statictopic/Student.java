package oops.statictopic;

import java.util.Scanner;
public class Student 
{
	int rno;
	String name;
	int std;
	static String schoolName;
	
	// static method
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName =schoolName;
	}
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
		System.out.println(rno + " " +name + " " +std + " " + schoolName);
	}
	public static void main(String[] args) 
	{
		Student.schoolName = "DPS";
		
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}

		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
		
		// static dm's can change by object name but change for all 
		s[2].schoolName="Meghdoot";
		
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
