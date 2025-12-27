package collectionfrmwrk.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insetion order
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer,String>();
		
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
