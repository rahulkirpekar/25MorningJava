package multithreadding.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi I am Thread : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
