package oops.inhtopic.mli;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	int salary;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id +" " + name +" " + salary +" " + dsgn);
	}
	public static void main(String[] args) 
	{
		TechEmployee e = new TechEmployee();

		e.scanData();
		e.dispData();
	}
}
