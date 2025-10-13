package oops.inhtopic.mlinh;

import java.util.Scanner;

public class Employee extends Person
{
	int id,salary;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary);
	}
}
