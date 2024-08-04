package collectionframework.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(50, "sagar");// [KEY,VALUE]---ENTRY
		map.put(32, "rakesh");
		map.put(34, "kunal");
		map.put(76, "krishna");
		map.put(2, "ankit");
		
		for( Map.Entry<Integer, String> e : map.entrySet()) 
		{
			// entry---key , value
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}