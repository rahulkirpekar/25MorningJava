package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		StringBuilder sb = new StringBuilder("royal");// NonThreadbased Application
		StringBuffer sb = new StringBuffer("abcd");// Threadbased Application

		System.out.println(sb +" " + sb.hashCode());
		sb.reverse();
		System.out.println(sb +" " + sb.hashCode());
		
		// Mutabel
//		sb.append(" technosoft");// royal technosoft
//		System.out.println(sb +" " + sb.hashCode());
	}
}
