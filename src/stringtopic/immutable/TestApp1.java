package stringtopic.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		int a[] = new int[5];
//		// array --.length--operator---[array size]
//		System.out.println(a.length);
		
		// name.length()---method---String class
		//			   012345678901234567890123
		String name = "Royal Technosoft Pvt Ltd";
//		System.out.println(name.length()); 

		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+i+") : " + name.charAt(i));
		}
//		System.out.println("name.charAt(1) : " + name.charAt(1));
//		System.out.println("name.charAt(2) : " + name.charAt(2));
//		System.out.println("name.charAt(3) : " + name.charAt(3));
//		System.out.println("name.charAt(4) : " + name.charAt(4));
		
	}
}
