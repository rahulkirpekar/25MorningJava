package oops.abstopic;

public class B extends A
{
	@Override
	void test1() 
	{
		System.out.println("B---test1()");
	}
	
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.test1();
		obj.test2();
		
	}
}
