package stringtopic.immutable;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name = "RAHUL KIRPEKAR";

		System.out.println("name : " + name);//rahul kirpekar
//		name.toUpperCase();// new String Object (RAHUL KIRPEKAR)
		
		name= name.toLowerCase();
		
		System.out.println("name : " + name);// rahul kirpekar
		
//		String name = "";
//		System.out.println(name.isEmpty());// true
//		System.out.println(name.isBlank());// true

//		String name = " ";
//		System.out.println(name.isEmpty());// false
//		System.out.println(name.isBlank());// true

//		String name = " rahul kirpekar ";
//		System.out.println(name.isEmpty());// false
//		System.out.println(name.isBlank());// false
		
/*		char value[] = name.toCharArray();// String---char array
		for (int i = 0; i < value.length; i++) 
		{
			System.out.println("value["+ i +"] : " + value[i]);
		}
		
		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+ i +") : "  + name.charAt(i));
		}
*/		
//		System.out.println(name.charAt(0));//r
//		System.out.println(name.charAt(1));//a
		
		
/*		
		int a[] = new int[5];
		System.out.println(a.length);
//		String name = "Royal Technosoft";
//							0	    1
		String name[] = {"rahul","ankur"};
		
		System.out.println(name.length);// 2 
		System.out.println(name[0].length());// 5
		System.out.println(name[1].length());// 5
*/	}
}
