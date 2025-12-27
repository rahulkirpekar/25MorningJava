package collectionfrmwrk.map;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Ascensing order Sorting
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		map.put(11, "Rahul");// [Key,value]---Entry
		map.put(2, "Krunal");
		map.put(13, "Rakesh");
		map.put(49, "Sagar");
		map.put(50, "Ankur");

		for(Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
