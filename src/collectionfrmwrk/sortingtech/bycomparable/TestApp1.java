package collectionfrmwrk.sortingtech.bycomparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1= new Student(1, "Rahul", 10, 90);
		Student s2= new Student(90, "Ankur", 5, 70);
		Student s3= new Student(20, "Sagar", 2, 100);
		Student s4= new Student(18, "Brijesh", 11, 95);
		Student s5= new Student(70, "Kunal", 12, 80);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);	
			System.out.println(s.getRno()+" " + s.getName()+" " +  s.getStd()+" " + s.getMarks());
		}
		System.out.println("--------------------------------------------------");

		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);	
			System.out.println(s.getRno()+" " + s.getName()+" " +  s.getStd()+" " + s.getMarks());
		}
	}
}
