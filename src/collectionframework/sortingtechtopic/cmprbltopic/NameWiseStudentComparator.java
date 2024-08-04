package collectionframework.sortingtechtopic.cmprbltopic;

import java.util.Comparator;

public class NameWiseStudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		return s1.getName().compareTo(s2.getName());
	}
}
