package oops.classobj;

import java.util.Scanner;

public class Student 
{
	// 1. Data Members
	int rno,std,marks;
	String name;
	
	// 2. Member Function
	void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
