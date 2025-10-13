package oops.inhtopic;

import java.util.Scanner;

// Single Inheriance
//--------------------

// Child class
public class Student extends Person
{
	int rno,std;

	public Student(int rno,String name,int std) 
	{
		super(name);
		this.rno = rno;
		this.std=std;
	}
	
/*	
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
*/
}
