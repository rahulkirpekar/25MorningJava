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
	public void updateStudent() 
	{

	}
	public void deleteStudent() 
	{

	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		
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
	}
}
