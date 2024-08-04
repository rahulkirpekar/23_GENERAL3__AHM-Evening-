package collectionframework.listtopic.task1;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		LinkedList<String>v = new LinkedList<String>();
		
		v.add("rahul");
		v.add("ankur");
		v.add("sagar");
		v.add("suresh");
		v.add("amar");
		v.add("ramesh");
		v.add("suresh");
		v.add("amar");

		Iterator<String> itr =	v.iterator();

		while(itr.hasNext()) 
		{
			String name = itr.next();
			
			System.out.println(name);
		}
	}
}