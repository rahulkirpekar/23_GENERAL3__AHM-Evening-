package stringtopic.basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		
		// valueOf-----------parseFloat()
		
		String v1 = String.valueOf(20);
		String v2 = String.valueOf(10);
		
		System.out.println(v1 + v2);
		
		
		int no1 = Integer.parseInt(v1);
		int no2 = Integer.parseInt(v2);
		
		System.out.println(no1 + no2);
		
		
//		Byte.parseByte(v2)
//		Float.parseFloat(v2)
//		Double.parseDouble(v2)
		
		
		
		
//		convert String to Integer 

/*		Primitive DataType------------->Wrapper class
   	    ******************				*************
   	     
		boolean------------------------>Boolean(class)
		
		byte--------------------------->Byte(class)
		
		char--------------------------->Character(class)
		
		short-------------------------->Short(class)
		int---------------------------->Integer(class)
		long--------------------------->Long(class)
		
		float-------------------------->Float(class)
		double------------------------->Double(class)
		
		
		
*/		
//		primitive DataTypes-----class
		
//		int no  = 10;
//		Integer obj = new  Integer(no);

		
		
				
		
		
		
//		parseInt
//		parseFloat
//		parseDouble
//		parseLong
//		parseShort
//		parseBoolean
		
		
//		String value = " royal ";
//		System.out.println("value.length() : " + value.length());// 
//		value = value.trim();//royal
//		System.out.println("value.length() : " + value.length());// 
		
		
//		length()             
//		String value = "royal";
//		System.out.println("value.length() : " + value.length());
		
		
		
		
//		String value = "This is Java which is developed by James Arthur Gosling";

//		System.out.println("value.toLowerCase() : " + value.toLowerCase());
//		System.out.println("value.toUpperCase() : " + value.toUpperCase());
		
//		char v[] = value.toCharArray();
//		System.out.println("v.length : " + v.length);
//		for (int i = 0; i < v.length; i++) 
//		{
//			System.out.println(v[i]);
//		}
		
//		String value2 =	value.substring(8, 12);
//		System.out.println("value2 : " + value2);
		
		
		
		
//		System.out.println("value.startsWith(\"developed\") : " + value.startsWith("developed"));
//		String words[] = value.split("\\s");
//		for (String word : words) 
//		{
//			System.out.println(word);
//		}
//		System.out.println("words.length : " + words.length);

		
		//		split()         
//		startsWith()         
//		substring()         
//		toCharArray()         
//		toLowerCase()         
//		toUpperCase()         
//		trim()         
//		valueOf()
		
		
		
//--------------------------------------------------------------------------------		
//		System.out.println("value.isEmpty() : " + value.isEmpty());  // false
//		System.out.println("value.isBlank() : " + value.isBlank());  // true
//--------------------------------------------------------------------------------		
		//			   0123456789012345678901234567890123456789012345678901234 
//		String stmt = "This is Java which is developed by James Arthur Gosling";
//--------------------------------------------------------------------------------		
//		String name1 = "royal";
//		String name2 = "royal";		
//		String name3 = new String("royal").intern();// TR		
		
//		System.out.println("name1==name2 : " + (name1==name2));// true
//		System.out.println("name1==name3 : " + (name1==name3));// true
//--------------------------------------------------------------------------------		
//		int index = stmt.lastIndexOf("is");
//		System.out.println("index : " + index); 
//--------------------------------------------------------------------------------		
//		int index = stmt.indexOf("Java");
		
//		System.out.println("index : " + index); 
//--------------------------------------------------------------------------------		
		// String to store into new [char array].
//		char value[] = new char[5];
//		stmt.getChars(8, 12, value, 0);
//		// [foreach / Enhanced forloop / Advaced for..loop] 
//		for(char a : value) 
//		{
//			System.out.print(a);
//		}
	}
}
