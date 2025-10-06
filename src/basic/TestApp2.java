package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name ; 
		
		System.out.println("Enter Name : ");
//		name = sc.next();// Single word
		name = sc.nextLine();// Single Line--Multiple words
		
		System.out.println("Name : " + name);
	}
}
