package multithreadding.byextendthread.task1;

public class MyThread1 extends Thread
{
	private Table t = null;
	
	public MyThread1(Table t ) 
	{
		this.t = t;
	}
	@Override
	public void run() 
	{
		t.printTable(5);
	}
}
