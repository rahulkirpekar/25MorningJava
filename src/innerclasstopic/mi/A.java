package innerclasstopic.mi;

// Outer class
public class A 
{
	private int no = 1000;
	// Member-Inner class	
	class B
	{
		void show() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A objA  = new A();
		
		A.B objB = objA.new B();
		
		objB.show();
	}
}
