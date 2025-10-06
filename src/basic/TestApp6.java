package basic;

import java.util.Scanner;

public class TestApp6 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Addition");	
		System.out.println("2) For Subtraction");	
		System.out.println("3) For Multiply");	
		System.out.println("4) For Division");	
		System.out.println("5) For Exit");	
//		char choice = sc.next().charAt(0);
		String choice= sc.next();
		int ans = 0;
		
		switch(choice)
		{
			case "add": ans = no1+no2;
					System.out.println("Addition : " + ans);
					break;
			case "sub": ans = no1-no2;
					System.out.println("Subtraction : " + ans);
					break;
			case "product": ans = no1*no2;
					System.out.println("Multiply : " + ans);
					break;
			case "div": ans = no1/no2;
					System.out.println("Division : " + ans);
					break;
			case "exit": System.out.println("Application will be exit");
					Thread.sleep(500);
					System.exit(0);
			default: System.out.println("\nInvalid Choice,\n\tPlease enter between 1 to 4 choice.");
		}
	}
}
