package collectionframework.sortingtechtopic.cmprbltopic;

public class Student //implements Comparable<Student>
{
	private int rno,std,marks;
	private String name;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std, int marks) 
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
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int compareTo(Student s2) 
//	{
//		if(getMarks() > s2.getMarks()) 
//		{
//			return 1;
//		}else if(getMarks() < s2.getMarks()) 
//		{
//			return -1;
//		}else 
//		{
//			return 0;
//		}
//	}
//	@Override
//	public int compareTo(Student s2) 
//	{
//		return getName().compareTo(s2.getName());
//	}
}
