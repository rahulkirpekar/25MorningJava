package oops.classobj;

import java.util.Scanner;

public class TeestApp1 
{
	public static void main(String[] args) 
	{
		// Student - reference type
		// s - reference variable(pointer variable) --store object address
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		// new - keyword---JVM---create Object--HEAP
		// Student---type object create
		
		System.out.println("s1 ===> "+s1);
		System.out.println("s2 ===> "+s2);
		System.out.println("s3 ===> "+s3);
		
		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
