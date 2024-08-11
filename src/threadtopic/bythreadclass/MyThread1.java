package threadtopic.bythreadclass;

public class MyThread1 extends Thread
{
	// job defined---run() method
	@Override
	public void run() 
	{
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("I am Daemon Thread :: " + Thread.currentThread().getName());
		}else
		{
			for (int i = 1; i <=5; i++) 
			{
				System.out.println(Thread.currentThread().getName() + "----" + i);
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
		
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();

		
		obj1.setDaemon(true);
		
		obj1.setName("C Language");
		obj2.setName("C++ Language");
		obj3.setName("Java Language");
		
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MAX_PRIORITY);
		
		
		obj1.start();

//		try 
//		{
//			obj1.join(1500);
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
		obj2.start();
		obj3.start();
	}
}