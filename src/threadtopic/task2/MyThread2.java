package threadtopic.task2;

public class MyThread2 extends Thread
{
	Table t = null;

	public MyThread2(Table t) 
	{
		this.t = t;
	}
	@Override
	public void run() 
	{
		t.printTable(10);
	}
}

