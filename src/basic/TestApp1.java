package basic;

import java.util.Scanner;// Optional

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		// 1. Local--Variable Declaration
		double no1,no2,ans;
	
		// 2. Variable Initialisation

		System.out.println("Enter No1 : ");
		no1 = sc.nextDouble();
		
		System.out.println("Enter No2 : ");
		no2 = sc.nextDouble();
		
		ans = no1 + no2;
		
		System.out.println("Addition : " + ans);
	}
}
