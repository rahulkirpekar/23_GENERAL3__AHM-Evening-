package collectionframework.listtopic;

public class Student 
{
	int rno,std;
	String name;
	
	
	public Student() 
	{
	}
	public Student(int rno, String name,int std) 
	{
		this.rno = rno;
		this.std = std;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Override
//	public String toString() 
//	{
//		return "===>" + rno+" " + name+" " + std;
//	}
}
