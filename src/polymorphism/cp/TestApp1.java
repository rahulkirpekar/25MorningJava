package polymorphism.cp;

import java.util.Scanner;

// Method Overlodding--->Different version
public class TestApp1 
{
	public static void addFun(short no1,short no2) 
	{
		System.out.println("Two(short) args : addFun() : " + (no1+no2));
	}
	public static void addFun(int no1,double no2) 
	{
		System.out.println("Two(int) args : addFun() : " + (no1+no2));
	}
	public static void addFun(double no1,int no2) 
	{
		System.out.println("Two(double) args : addFun() : " + (no1+no2));
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Three args : addFun() : " + (no1+no2+no3));
	}

	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("Four args : addFun() : " + (no1+no2+no3+no4));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter No1: ");
//		int no1 = sc.nextInt();
//		System.out.println("Enter No2: ");
//		int no2 = sc.nextInt();
		
		addFun(10, 10);
	}
}


/*
Type pramotion Rule[Method Overloadding]:-
-----------------------------------------------

				boolean----X
			
						byte
						  |
						short
						  |
			char-------->int
						  |
						 long  	
			  			  |
			  			float
			  			  |
			  			double  
*/









