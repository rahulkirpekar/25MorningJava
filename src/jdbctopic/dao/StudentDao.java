package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student (name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
	
		System.out.println("insertQuery :  "+ insertQuery);
		
		int rowsAffected = 0;
		
							// 1. Get Database Connection
		Connection conn = DBConnection.getDBConnection();

		Statement stmt = null;
		
		// 2. Validate conn object
		if (conn != null) 
		{
			
			try 
			{
				// 3. create object of Statement by conn object
				stmt = conn.createStatement();
				
								// 4. execute Insert-SQL query
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---insertStudent() Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"' , std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;
		
		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getDBConnection();
		Statement stmt = null;
		int rowsAffected = 0; 
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--updateStudent()---Db not connected");
		}
		return  rowsAffected;
	}
	public int deleteStudentById(int rno) 
	{
		String deleteQuery  = "DELETE FROM student WHERE rno="+rno;
		
		System.out.println("deleteQuery : " + deleteQuery);
		
		Connection conn = DBConnection.getDBConnection();
		Statement stmt = null;
		int rowsAffected = 0; 
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--deleteStudent()---Db not connected");
		}
		return  rowsAffected;
	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter Student Rno Which you want to Update : ");
		int rno= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean();

		sbean.setName(name);
		sbean.setStd(std);
		sbean.setMarks(marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated  : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		
/*		
 		--------DELETE STudent------------

		System.out.println("Enter Student Rno Which you want to Delete : ");
		int rno= sc.nextInt();
		
		StudentDao dao = new StudentDao();
		int rowsAffected = dao.deleteStudentById(rno);
		
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
 		
 		--------INSERT STudent------------
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean();

		sbean.setName(name);
		sbean.setStd(std);
		sbean.setMarks(marks);
		
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/
	}
}
