package prac;

public class Dog 
{
	private String name  ;
	private String breed ;
	
	public Dog(String name, String breed) 
	{
		this.name = name;
		this.breed = breed;
	}
	// setters
	public void setData(String name,String breed) 
	{
		this.name=name;
		this.breed=breed;
	}
	public void dispData() 
	{
		System.out.println(name +" " + breed);
	}
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("abc","123");
		Dog d2 = new Dog("def","456");
		
		d1.dispData();
		d2.dispData();
		
		System.out.println("After setdata methods called...");
		d1.setData("eif", "878");
		d2.setData("xyz", "434");
		
		d1.dispData();
		d2.dispData();
		
	}
}
