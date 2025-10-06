package oops.encapstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s= new Student();
		
		// setters
		s.setRno(1);
		s.setName("Ankit");
		s.setStd(12);
		s.setMarks(100);
		
		// getters
		System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
	}
}
