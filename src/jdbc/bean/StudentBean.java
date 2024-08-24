package jdbc.bean;

// POJO --- pure Encapsulation
public class StudentBean 
{
	 private int rno   ;
	 private String name  ;
	 private String std   ;
	 private int marks ;
	 
	 
	 public StudentBean() 
	 {
	}
	 
	public StudentBean(int rno, String name, String std, int marks) {
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
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
