package threadtopic.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread2 t2 = new MyThread2(resource);
		MyThread3 t3 = new MyThread3(resource);
		
		t1.start();
		t2.start();
		t3.start();
	}
}