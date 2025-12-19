package iotopic.objectdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp3
{
	public static void main(String[] args) 
	{
		// Object Instantiation with Initialisation
		Student s[] = 
					{
						new Student(1, "Rahul", 12),
						new Student(2, "Ankur", 10),
						new Student(3, "Sagar", 8)
					};
		try 
			(
				FileOutputStream fout = new FileOutputStream("studentrecord.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			
			out.writeObject(s);
		
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
