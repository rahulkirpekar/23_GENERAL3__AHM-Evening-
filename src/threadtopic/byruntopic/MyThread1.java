package threadtopic.byruntopic;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi I am Thread - "+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		MyThread1 th4 = new MyThread1();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
