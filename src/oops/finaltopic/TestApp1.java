package oops.finaltopic;

public class TestApp1 
{
	// Data Member
	final int no ;// = 100;
	
	public TestApp1() 
	{
		no = 200;
	}
	public TestApp1(int no) 
	{
		this.no = no;
	}
	
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1(300);
		
//		obj.no = 100;
		System.out.println("obj.no : " + obj.no);
//		
//		obj.no = 200;
//		System.out.println("obj.no : " + obj.no);
		
		
/*		
   		final -->non-access Modifiers
		-----------------------------
		1. local variable
		2. Data Members
		3. member function
		4. class
*/		
//		final int no;
//		no = 100;
//		System.out.println("No : " + no);
//		no = 100;//C.E
//		System.out.println("No : " + no);
		
	}
}
