package collectionframework.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TeestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>listObj = new ArrayList<String>();
		
		listObj.add("royal");// string	// ----0 <===itr store[primitive----->object]
		listObj.add("sagar");// string	// ----0 <===itr store[primitive----->object]
		listObj.add("neel");// string	// ----0 <===itr store[primitive----->object]
		listObj.add("kunal");// string	// ----0 <===itr store[primitive----->object]
		listObj.add("royal");// string	// ----0 <===itr store[primitive----->object]
		
		Iterator<String> itr = listObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
//		listObj.add('r');//char---Character// ----1
//		listObj.add(10);//int--Integer// ----2
//		listObj.add(1232L);//long---Long// ----3
//		listObj.add(21324.432);//double---Double// ----4
//		listObj.add(123.432f);//float---Float// ----5
//		listObj.add(true);//boolean--Boolean// ----6
//		listObj.add(s);//object-// ----7
		
	}
}
