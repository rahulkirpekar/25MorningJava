package oops.encapstopic;

// Pure Encapsulation -- Data Security

// dm--private
// mf--public
public class Student 
{
	// 1. Data Members---private
	private int rno,std,marks;
	private String name;

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
