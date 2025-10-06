package oops.inhtopic;

import java.util.Scanner;

// Single Inheriance
//--------------------

// Child class
public class Student extends Person
{
	int rno,std;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno  = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name  = sc.nextLine();
		System.out.println("Enter Std : ");
		std  = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	public static void main(String[] args) 
	{
		Student s1= new Student();// s1--[rno name std]
		Student s2= new Student();// s2--[rno name std]
		Student s3= new Student();// s3--[rno name std]

		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
