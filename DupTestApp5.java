package iotopic.stringdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		// AutoClosable Resource
		try
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\25MorningJava\\listofroyal.txt");
			) 
		{
			int temp;
			
			while((temp = fin.read()) != -1) 
			{
				sb.append((char)temp);
			}
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.print("Final String : " + sb.toString());
	}
}
