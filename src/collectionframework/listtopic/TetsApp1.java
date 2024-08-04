package collectionframework.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TetsApp1 
{
	public static void main(String[] args) 
	{
		Student s= new Student(1, "nakshi", 12);
		
		ArrayList listObj = new ArrayList();
		
		listObj.add("royal");// string	// ----0 <===itr store[primitive----->object]
		listObj.add('r');//char---Character// ----1
		listObj.add(10);//int--Integer// ----2
		listObj.add(1232L);//long---Long// ----3
		listObj.add(21324.432);//double---Double// ----4
		listObj.add(123.432f);//float---Float// ----5
		listObj.add(true);//boolean--Boolean// ----6
		listObj.add(s);//object-// ----7
		
		System.out.println("listObj.size() : " + listObj.size());//8
		System.out.println("listObj.get(3) : " + listObj.get(3));
		
//		Iterator itr =	listObj.iterator();
//		while(itr.hasNext()) 
//		{
//			Object obj = itr.next();
//			
//			if (obj instanceof Student) 
//			{
//				Student s1 = (Student)obj;
//				System.out.println(s1.getRno()+" " + s1.getName()+ " " + s1.getStd());
//			}else 
//			{
//				System.out.println(obj);//Integer---toString---value
//			}
//		}	
//------------------------------------------------------------------------------------------
		// simple for loop		
//		for(int i = 0 ; i < listObj.size(); i++) 
//		{
//			Object obj = listObj.get(i);
//			
//			if(obj instanceof Student) 
//			{
//				Student d = (Student)obj;
//				System.out.println(d.getRno()+" " + d.getName()+" " + d.getStd());
//				
//			}else
//			{
//				System.out.println(obj);// royal--String---toString()---value
//			}
//		}
//------------------------------------------------------------------------------------------

		// foreach / Enhanced /Advanced for loop

		for(Object obj : listObj) 
		{
//			System.out.println(obj);
			if(obj instanceof Student)                                                
			{                                                                         
				Student d = (Student)obj;                                             
				System.out.println(d.getRno()+" " + d.getName()+" " + d.getStd());    
				                                                                      
			}else                                                                     
			{                                                                         
				System.out.println(obj);// royal--String---toString()---value         
			}                                                                         
		}
	}
}



