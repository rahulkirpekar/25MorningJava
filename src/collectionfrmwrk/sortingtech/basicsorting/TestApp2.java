package collectionfrmwrk.sortingtech.basicsorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("kunal");
		list.add("ankur");
		list.add("brijesh");
		list.add("sagar");
		list.add("ramesh");
		list.add("jaynam");
		
		for (int i = 0; i < list.size(); i++) 
		{
			String name = list.get(i);
			System.out.println(name);
		}
		System.out.println("----------------------------------------------------");
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) 
		{
			String name = list.get(i);
			System.out.println(name);
		}
	}
}
