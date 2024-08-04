package collectionframework.sortingtechtopic.primtopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> nameList = new ArrayList<String>() ;
		
		nameList.add("rahul");
		nameList.add("sagar");
		nameList.add("neel");
		nameList.add("prem");
		nameList.add("rushil");
		nameList.add("priyanka");
		
		for (int i = 0; i < nameList.size(); i++) 
		{
			String name = nameList.get(i);
			System.out.println(name);
		}
		
		Collections.sort(nameList);
		
		System.out.println("---------------------");
		for (int i = 0; i < nameList.size(); i++) 
		{
			String name = nameList.get(i);
			System.out.println(name);
		}
	}
}
