package oops.consttopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println("=====START : Main Method=====");
		Student s1= new Student(1, "Ankur", 12,100);
		
		Student s2 = new Student(s1);
		
		System.out.println(s1.getRno()+" " + s1.getName()+" "+s1.getStd()+" "+s1.getMarks());
		System.out.println(s2.getRno()+" " + s2.getName()+" "+s2.getStd()+" "+s2.getMarks());
		
		System.out.println("=====EXIT : Main Method=====");
	}// s1,s2
}
