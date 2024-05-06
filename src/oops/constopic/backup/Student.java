package oops.constopic.backup;

public class Student 
{
	int rno;
	String name;
	int std;
	String schoolName;
	int marks;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public Student(int rno, String name, int std, String schoolName) 
	{
		this(rno, schoolName, std);
		this.schoolName = schoolName;
	}
	public Student(int rno, String name, int std, String schoolName, int marks) 
	{
		this(rno, name, std, schoolName);
		this.marks = marks;
	}
	public void dispData() 
	{
		System.out.println(this.rno + " " + this.name +" " + this.std+ " " +this.schoolName +" " + this.marks +"===>" + this);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, "DPS", 100);
//		Student s2 = new Student(2, "ankur", 10, "ABC");
//		Student s3 = new Student(3, "sagar", 11);
		
		s1.dispData();
//		s2.dispData();
//		s3.dispData();
	}
}