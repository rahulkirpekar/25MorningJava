package multithreadding.byextendthread.task2;

public class Table 
{
	// synchronized---Threadsafe---at time Single Thread execute resource
	public synchronized void printTable(int no) 
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
			System.out.println(no+ " * " + i +" = " + (no*i) +"---"+Thread.currentThread().getName());
		}
	}
}
	