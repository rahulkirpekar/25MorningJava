package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Typesafe---Single Type
		ArrayList<String>list1 = new ArrayList<String>();
		
		list1.add("rahul");
		list1.add("shivam");
		list1.add("dhriti");
		list1.add("mahim");
		list1.add("vishwesh");
		list1.add("xena");
		
		Iterator<String> itr = 	list1.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
		
		// add---
		// delete -- remove
		// update--set
		
//		list1.remove(0);
		
		list1.set(3, "Mahim Joshi");
		
		System.out.println("--------------------------------------------");
		itr = 	list1.iterator();
		
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
		
		
		
		
//		ArrayList<Integer>list2 = new ArrayList<Integer>();
//		list2.add(10);
//		list2.add(20);
//		list2.add(30);
//		list2.add(40);
//		list2.add(50);
//
//		System.out.println("------------------------------------");
//		
//		Iterator<Integer> itr2 = 	list2.iterator();
//		
//		while(itr2.hasNext()) 
//		{
//			int value = itr2.next();
//			System.out.println(value);
//		}
	}
}
