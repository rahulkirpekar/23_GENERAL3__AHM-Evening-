package threadtopic.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread t1 = new MyThread(resource);
		MyThread t2 = new MyThread(resource);
		MyThread t3 = new MyThread(resource);
		MyThread t4 = new MyThread(resource);
		MyThread t5 = new MyThread(resource);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
