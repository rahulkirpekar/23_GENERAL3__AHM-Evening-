package threadtopic.task1;

public class MyThread extends Thread
{
	Table t = null;

	public MyThread(Table t) 
	{
		this.t = t;
	}
	@Override
	public void run() 
	{
		t.printTable(5);
	}
}
