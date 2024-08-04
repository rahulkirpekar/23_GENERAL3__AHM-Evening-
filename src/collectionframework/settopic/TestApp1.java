package collectionframework.settopic;

import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> setObj = new TreeSet<>();
		
		setObj.add("royal");
		setObj.add("ramesh");
		setObj.add("amar");
		setObj.add("neel");
		setObj.add("harsh");
		setObj.add("royal");

		System.out.println(setObj.size());//5
		
		System.out.println("setObj===>"+setObj);
		
	}
}
