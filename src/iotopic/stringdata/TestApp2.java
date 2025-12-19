package iotopic.stringdata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		// Character orientedway read from file
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\25MorningJava\\morning.txt");

			int temp;
			
			while((temp = fr.read()) != -1) 
			{
				sb.append((char)temp);
			}
			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb.toString());
	}
}