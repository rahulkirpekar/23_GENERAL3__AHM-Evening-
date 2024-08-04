package collectionframework.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");//<==queue
		queue.add("ankur");
		queue.add("sagar");
		queue.add("suresh");
		queue.add("amar");
		queue.add("amar");
		queue.add("ramesh");

		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			
			System.out.println(name);
		}
	}
}
