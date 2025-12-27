package collectionfrmwrk.queue;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering 
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		queueObj.add("rahul");
		queueObj.add("rakesh");
		queueObj.add("ganesh");
		queueObj.add("sagar");
		queueObj.add("kunal");
		queueObj.add("sujal");
		
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			System.out.println(name);
		}
	}
}
