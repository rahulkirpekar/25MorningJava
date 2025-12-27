package collectionfrmwrk.map;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Map = [Key,Value] --- Single Entry ---> Map
		
		//HashMap---------Not Maintain insertion order
		//LinkedHashMap---Maintain insertion order
		//TreeMap---------Ascending order Sorting 

		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
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
