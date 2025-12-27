package collectionfrmwrk.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Set(I)---Remove Duplicate Values
		//	|
		// 1. HashSet--------Not Maintain Insertion Order.
		// 2. LinkedHashSet-- Maintain Insertion Order.
		// 3. TreeSet -------Ascending Sorting.

		//  Not Maintain Insertion order 
//		HashSet<String> setObj = new HashSet<>();
		
		// Maintain Insertion order 
//		LinkedHashSet<String> setObj = new LinkedHashSet<>();
	
		// Ascensing Order Sorting
		TreeSet<String> setObj = new TreeSet<String>();
		setObj.add("rakesh");
		setObj.add("ganesh");
		setObj.add("sagar");
		setObj.add("kunal");
		setObj.add("rahul");
		setObj.add("rakesh");
		setObj.add("ganesh");
		setObj.add("sagar");
		setObj.add("kunal");
		setObj.add("sujal");

		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
