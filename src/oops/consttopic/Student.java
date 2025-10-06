package oops.consttopic;

// GC - Garbage Collector---Daemon Thread
//----------------------------------------
public class Student 
{
	// 1. Data Members---private
	private int rno,std,marks;
	private String name;

	// 1. Default--Constructor---Special Function
	public Student()
	{
		System.out.println("START :: Default Constructor");
		
		System.out.println(rno+" " + name+" " + std+" " + marks);
		
		rno = 1;
		name = "rahul";
		std = 12;
		marks=12;
		
		System.out.println(rno+" " + name+" " + std+" " + marks);
		System.out.println("EXIT :: Default Constructor");
	}
	// 2. Para
	public Student(int rno,String name,int std,int marks)
	{
		System.out.println("START :: Para Constructor");

		this.rno  = rno;
		this.name = name;
		this.std  = std;
		this.marks = marks;
		System.out.println("EXIT :: Para Constructor");
	}
	// 2. Copy--->Para Constructor
	public Student(Student s) 
	{
		System.out.println("START :: COPY Constructor");
		this.rno  = s.rno;
		this.name = s.name;
		this.std  = s.std;
		this.marks = s.marks;
		System.out.println("EXIT :: COPY Constructor");
	}
	
	// Member Function--public

	// setters(Mutators) and getters(Accessors)
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	public void setMarks(int marks) 
	{
		this.marks=marks;
	}
	
	public int getRno() 
	{
		return rno;
	}

	public String getName() 
	{
		return name;
	}

	public int getStd() 
	{
		return std;
	}

	public int getMarks() 
	{
		return marks;
	}
}
