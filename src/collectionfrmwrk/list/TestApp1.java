package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);//0 <==itr boolean----Boolean(WrapperClass)--Object(Auto-Boxing) 
		list.add(12);//1 int--Integer
		list.add('R');//2
		list.add("Royal");//3
		list.add(12f);//4
		list.add(5432L);//5
		list.add(234.34);//6
		
		Student s= new Student(1, "Kunal", 12);
		list.add(s);//7

		System.out.println("list.size() : " + list.size());

		System.out.println("list.get(0) : " + list.get(0));
		int i =0;
		
		// Traditional Way
		
		Iterator itr =	list.iterator();
	
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
/*
		// Advanced for loop / ForEach Loop / Enhanced for Loop
		for(Object obj : list) 
		{
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println("list.get("+i+") : " + s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println("list.get("+i+") : " +obj);
			}
			i++;
		}
  ----------------------------- 
   		// Standard For Loop
   		for(int i = 0 ; i < list.size();i++) 
		{
			Object obj = list.get(i);
			
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println("list.get("+i+") : " + s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			} else 
			{
				System.out.println("list.get("+i+") : " +obj);
			}
		}
 */
	}
}
