package collectionframework.sortingtechtopic.cmprbltopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul",12,90);
		Student s2 = new Student(2, "rakesh",12,43);
		Student s3 = new Student(3, "kunal",12,96);
		Student s4 = new Student(4, "sagar",12,23);
		Student s5 = new Student(5, "ankur",12,100);

		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =  list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		Collections.sort(list, new MarksWiseStudentComparator());
		System.out.println("After Student Marks Wise Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =  list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		Collections.sort(list, new NameWiseStudentComparator());
		System.out.println("After Student Name Wise Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =  list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		Collections.sort(list, new StdWiseStudentComparator());
		System.out.println("After Student Std Wise Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =  list.get(i);
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	}
}