package oops.inhtopic.constinh.constthis;

public class Student 
{
	int rno,std,marks;
	String name;

	public Student()
	{
		rno=0;
		name="";
		std=0;
		marks=0;
		System.out.println("Student---Default Constructor");
	}
	public Student(int rno,String name)
	{
		this();
		this.rno = rno;
		this.name = name;
		System.out.println("Student(int rno,String name)---Para Constructor");
	}
	public Student(int rno,String name,int std)
	{
		this(rno, name);
		this.std = std;
		System.out.println("Student(int rno,String name,int std)---Para Constructor");
	}
	public Student(int rno,String name,int std,int marks)
	{
		// this as constructor
		this(rno, name, std);
		this.marks = marks;
		System.out.println("Student(int rno,String name,int std,int marks)---Para Constructor");
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
	
}
