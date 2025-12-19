package iotopic.stringdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// AutoClosable Resource
		try 
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25MorningJava\\src\\iotopic\\stringdata\\TestApp5.java");
				FileOutputStream fout = new FileOutputStream("DupTestApp5.java");	
			)
		{
			int temp;
			
			while((temp=fin.read())!=-1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
