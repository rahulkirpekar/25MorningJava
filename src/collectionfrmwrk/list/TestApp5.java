package collectionfrmwrk.list;

import java.util.Iterator;
import java.util.Vector;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		
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
