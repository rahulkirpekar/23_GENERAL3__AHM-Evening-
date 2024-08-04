package collectionframework.sortingtechtopic.cmprbltopic;

import java.util.Comparator;

public class StdWiseStudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.getStd() > s2.getStd()) 
		{
			return 1;
		}else if(s1.getStd() < s2.getStd()) 
		{
			return -1;			
		}else
		{
			return 0;
		}
	}
}
