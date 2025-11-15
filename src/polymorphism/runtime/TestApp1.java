package polymorphism.runtime;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Home");
		System.out.println("2) For Org");
		System.out.println("3) For School");
		int choice = sc.nextInt();
		
		Person person = null;
		
		switch (choice) 
		{
			case 1: // Upcasting--[Parent reference = Child Object]
					person = new Home(); // Runtime Polymorphism
					person.getBehave();
					
					// Downcasting---To access child specific method
					Home home = (Home)person;
					home.getMovieOntime();
					break;
					
			case 2: person = new Org();
					person.getBehave();

					// Downcasting---To access child specific method
					Org org = (Org)person;
					org.getSalary();
					break;
					
			case 3: person = new School();
					person.getBehave();
					
					// Downcasting---To access child specific method
					School school = (School)person;
					school.getResult();
					break;
		}
	}
}