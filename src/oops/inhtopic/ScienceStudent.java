package oops.inhtopic;

/*
 * 	Person(name)
 *    |
 *  Student  (rno,std) 
 *    |
 * SciStudent (subject)   
 * 
 * */
public class ScienceStudent extends Student
{
	String subject;

	public ScienceStudent(int rno,String name,int std,String subject) 
	{
		super(rno, name, std);
		this.subject = subject;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + subject);
	}
	
	public static void main(String[] args) 
	{
		ScienceStudent s1= new ScienceStudent(1,"Rahul",12,"Maths");// s1--[rno name std]
		ScienceStudent s2= new ScienceStudent(2,"Ankur",12,"Maths");// s2--[rno name std]
		ScienceStudent s3= new ScienceStudent(3,"sagar",12,"Maths");// s3--[rno name std]

		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
