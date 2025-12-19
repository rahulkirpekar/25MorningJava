package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp6 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception---custom Exception
			// 1. checked exception
//			throw new IOException("\nInvalid Age,\n\tPlease netr valid age for Vote");
//			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease netr valid age for Vote\"");
			
			
			// 2. Unchecked exception
//			throw new ArithmeticException("\nInvalid Age,\n\tPlease netr valid age for Vote");
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease netr valid age for Vote\"");
		} 
		else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Votting : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} 
		catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("=======General Statement=======");
	}
}
