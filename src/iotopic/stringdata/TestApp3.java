package iotopic.stringdata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\25MorningJava\\src\\iotopic\\stringdata\\TestApp1.java");

			FileWriter fw = new FileWriter("DupTestApp1.java");
			
			int temp;
			
			while((temp = fr.read() )!= -1) 
			{
				System.out.print((char)temp);
				fw.write(temp);
			}
			
			fw.close();
			fr.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
