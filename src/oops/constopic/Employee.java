package oops.constopic;

public class Employee 
{
	int id,salary;
	String name,dsgn;
	
	// Default Constructor
	Employee()
	{
		System.out.println("START :: Default Constructor");
		System.out.println("BEFORE :: " + id + " " + name + " " + salary + " " +dsgn+"-------"+this);

		id = 1;
		name="dharmesh";
		salary=1200;
		dsgn="SE";
		
		System.out.println("AFTER :: " + id + " " + name + " " + salary + " " +dsgn);
		System.out.println("EXIT :: Default Constructor");
	}
	// Parameterised Constructor
	Employee(int id,String name,int salary,String dsgn)
	{
		System.out.println("START :: Parameterised Constructor");
		System.out.println("BEFORE :: " + this.id + " " + this.name + " " + this.salary + " " +this.dsgn+"-------"+this);

		this.id = id;
		this.name=name;
		this.salary=salary;
		this.dsgn=dsgn;
		
		System.out.println("AFTER :: " + id + " " + name + " " + salary + " " +dsgn);
		System.out.println("EXIT :: Parameterised Constructor");
	}
	// Copy Constructor
	Employee(Employee e)
	{
		System.out.println("START :: Copy Constructor");
		System.out.println("BEFORE :: " + this.id + " " + this.name + " " + this.salary + " " +this.dsgn+"-------"+this);

		this.id = e.id;
		this.name=e.name;
		this.salary=e.salary;
		this.dsgn=e.dsgn;
		
		System.out.println("AFTER :: " + id + " " + name + " " + salary + " " +dsgn);
		System.out.println("EXIT :: Copy Constructor");
	}
	public void dispData() 
	{
		System.out.println("dispData()----------------------"+this);
		System.out.println("id : " +     id);//0
		System.out.println("name : " +   name);//null
		System.out.println("salary : " + salary);//0
		System.out.println("dsgn : " +   dsgn);//null
	}
	public static void main(String[] args) 
	{
		Employee e1  = new Employee(2,"rahul",1200,"SE");
		e1.dispData();
		Employee e2  = new Employee(e1);
		e2.dispData();
	}
}