package threadtopic.task1;

public class Table 
{
	public void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(no + " * " + i + " = " + (no*i)+"==="+Thread.currentThread().getName());
		}
	}
}