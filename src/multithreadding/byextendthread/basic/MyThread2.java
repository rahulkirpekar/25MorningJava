package multithreadding.byextendthread.basic;

public class MyThread2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=3 ; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("I : " + i +"---"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
//		System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
	
		t1.start();
		t2.start();
		t3.start();
	}
}