package jdbc.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.util.DBConnection;

// StudenDao---Student Table
public class StudenDao 
{
	// insert SQL Query---Student
	public int insertStudent(String name,String std,int marks) 
	{
		int rowsAffected = 0;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+name+"','"+std+"',"+marks+")";
		
		System.out.println("insertQuery : " + insertQuery);
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		
		
		StudenDao dao = new StudenDao();
		
		int rowsAffected = dao.insertStudent(name,std,marks);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succesfully Inserted");
		} else 
		{
			System.out.println("Student record not Inserted");
		}
	}
}