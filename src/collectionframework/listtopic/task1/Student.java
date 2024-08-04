package collectionframework.listtopic.task1;

import java.util.Scanner;

// Pure Encapsulation---class----[Data security]
//	1) Dm's---private
//  2) Mf's--public
public class Student 
{
	private int rno ;
	private String name;
	private int std ;
	private float marks;

	public Student() 
	{
	}
	public Student(int rno, String name, int std, float marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextFloat();
	}
	public void updateData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextFloat();
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+" " + std + " " +marks);
	}
}