package stringtopic.immutable;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		//			    0   1    2    3    4   5       6   7      8
		String stmt = "This is Java which is developed By James Gosling";
		
		System.out.println(stmt);
		
		String a = stmt.repeat(5);
		
		System.out.println(a);
		
		// String convert into bytes
//		byte b[] = stmt.getBytes();
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(stmt.charAt(i)+"---"+b[i]);
//		}
		
//		String words[] = stmt.split("\\s");
//		for (int i = 0; i < words.length; i++) 
//		{
//			System.out.println("words["+i+"] : " + words[i]);
//		}
//		String name1 = " rahul ";
//		System.out.println(name1+"---"+name1.length());// rahul---7
//		name1= name1.trim();// rahul
//		System.out.println(name1+"---"+name1.length());// rahul---7
		
//		String name2 = "kirpekar";
//		System.out.println(name1+name2);// rahulkirpekar
//		System.out.println(name1.concat(name2));// rahulkirpekar
		
		
		//			   0123456789012345678901	
//		String stmt = "This is Java which is developed By James Gosling";

//		String newStr = stmt.substring(8);
//		System.out.println("newStr: " + newStr);

//		String newStr = stmt.substring(8, 12);// Java
//		System.out.println("newStr: " + newStr);

//		System.out.println(stmt.lastIndexOf("is"));
		
//		System.out.println(stmt.indexOf("is"));// 2
		
//		System.out.println(stmt.startsWith("is"));// true
//		System.out.println(stmt.endsWith("by"));
		
//		boolean flag = stmt.contains("is");// true
//		System.out.println(flag);
//		String name1 = "Rahul";
//		String name2 = "rahul";
//		System.out.println(name1.compareTo(name2));
//		if (name1.equals(name2)) 
//		if (name1.equalsIgnoreCase(name2)) 
//		if (name1.compareTo(name2) == 0) 
/* 		if (name1.compareToIgnoreCase(name2) == 0) 
		{
			System.out.println("Both Names are same.");
		} else 
		{
			System.out.println("Both Names are not same.");
		}
*/	}
}
