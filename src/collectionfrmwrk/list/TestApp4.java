package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		int rno;
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int i;
		int choice = 0 ;
		
		do 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update By Student Id");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Search By Student Id");
			System.out.println("5) For Display All Student");
			System.out.println("6) Exit Student Application");
			choice  = sc.nextInt();
			
			switch (choice) 
			{
				case 1: 
						System.out.println("Enter Rno : ");
						rno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Name : ");
						String name = sc.nextLine();
						System.out.println("Enter Std : ");
						int std = sc.nextInt();
						System.out.println("Enter Marks : ");
						int marks = sc.nextInt();
						
						s = new Student(rno, name, std, marks);
						list.add(s);
						System.out.println("Student record successfully Inserted.");
						break;
						
				case 2: System.out.println("Enter Rno which you want to Update : ");
						rno = sc.nextInt();
						
						flag = false;
						for (i = 0; i < list.size(); i++) 
						{
							s =	list.get(i);
							
							if(rno == s.getRno()) 
							{
								flag = true;
								break;
							}
						}
						if(flag) 
						{
							Student s1 = list.get(i);
							s1.update();
							list.set(i, s1);
							System.out.println("Studen record updated.");
						}else 
						{
							System.out.println(rno + " not found in Student records.");
						}
						break;
						
				case 3: System.out.println("Enter Rno which you want to Delete : ");
						rno = sc.nextInt();
						flag = true;
						for (i = 0; i < list.size(); i++) 
						{
							s =	list.get(i);
							
							if(rno == s.getRno()) 
							{
								flag = false;
								list.remove(i);
								System.out.println("Student record suucessfully removed.");
								break;
							}
						}
						if(flag) 
						{
							System.out.println(rno + " not found in Student records.");
						}
						break;
				case 4:
					
						System.out.println("Enter Rno which you want to Search : ");
						rno = sc.nextInt();
						flag = true;
						for (i = 0; i < list.size(); i++) 
						{
							s =	list.get(i);
							
							if(rno == s.getRno()) 
							{
								flag = false;
								System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
								break;
							}
						}
						if(flag) 
						{
							System.out.println(rno + " rno not found in Student records.");
						}
						break;
				case 5:
						for(i = 0 ; i < list.size();i++) 
						{
							s = list.get(i);
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
						}
						break;
				case 6:	
						System.out.println("Student Application will be  shutdown");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(1);
			}
			
		}while(choice != 0);
	}
}