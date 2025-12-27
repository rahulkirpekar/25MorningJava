package collectionfrmwrk.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("rahul");
		list.add("rakesh");
		list.add("ganesh");
		list.add("sagar");
		list.add("kunal");
		list.add("sujal");

		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
