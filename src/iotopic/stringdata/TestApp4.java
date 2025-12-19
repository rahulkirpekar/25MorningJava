package iotopic.stringdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=  sc.nextLine();
		
		// String Data----write-----Byteorientedway----File
		try 
		{
			FileOutputStream fout = new FileOutputStream("listofroyal.txt");
		
			// String---convert into byte
			byte b[] = name.getBytes();	
			
			fout.write(b);
		
			fout.close();
			System.out.println("success");
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
