package jdbc.dao;

import java.sql.Connection;
import java.sql.Statement;

import jdbc.util.DBConnection;

// StudenDao---Student Table
public class StudenDao 
{
	// insert SQL Query---Student
	public int insertStudent() 
	{
		int rowsAffected = 0;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('sagar','12',100)";
		
		Statement stmt = null;
		
		// 1) Database Connection Object
		Connection conn = DBConnection.getConnection();
		
		// 2) validaate dbconnection object
		if (conn!=null) 
		{
			try 
			{
				// 3) create Statement object
				stmt = conn.createStatement();
				
				// 4) exeecute sql insert query
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudenDao insertStudent() :: Db not Connected");
		}
		return rowsAffected;
	}
	// update SQL Query---Student
	public void updateStudent() 
	{

	}
	
	// delete SQL Query---Student
	public void deleteStudent() 
	{

	}
	
	// Select SQL Query---Student
	public void getAllStudents() 
	{

	}
	
	public static void main(String[] args) 
	{
		StudenDao dao = new StudenDao();
		
		int rowsAffected = dao.insertStudent();
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succesfully Inserted");
		} else 
		{
			System.out.println("Student record not Inserted");
		}
	}
}