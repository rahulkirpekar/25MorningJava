package collectionfrmwrk.sortingtech.basicsorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(23);
		list.add(90);
		list.add(22);
		list.add(3);
		list.add(6);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Integer value = list.get(i);
			System.out.println(value);
		}
		System.out.println("----------------------------------------------------");
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Integer value = list.get(i);
			System.out.println(value);
		}
	}
}
