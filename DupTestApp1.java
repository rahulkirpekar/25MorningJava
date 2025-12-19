package iotopic.stringdata;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=  sc.nextLine();
		
		// Character orientedway---write---file
		try 
		{
			FileWriter fw = new FileWriter("morning.txt");
		
			// process---write
			fw.write(name);
		
			fw.close();	
			System.out.println("success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
