package oops.abstopic.interfacetopic;

public abstract interface A 
{
	// 1. Constant Variables[public static final]
	public static final int NO = 10;// public static final
	
//2. Member Function
//---------------------
		//1.Abstract Method
		public abstract void test1();// public abstract		
	
//2.Non-Abstract Method		
//---------------------
//		1.static method---Java 8th version
		public static void test2() 
		{
			System.out.println("A--static--test2()");
		} 	
			
//		2.default method---Java 8th version
		public default void test3() 
		{
			System.out.println("START : A--default--test2()");
			test4();
			test4();
			test4();
			test4();
			System.out.println("EXIT : A--default--test2()");
		} 	
		
//		3.private method---Java 9th version		
		private void test4() 
		{
			System.out.println("A--private--test4()");
		} 	
}
