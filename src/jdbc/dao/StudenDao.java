package jdbc.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// StudenDao---Student Table
public class StudenDao 
{
	// insert SQL Query---Student
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+sbean.getName()+"','"+sbean.getStd()+"',"+sbean.getMarks()+")";
		
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
	public int deleteStudent(int rno) 
	{
		int rowsAffected = 0 ;
		
		String deleteQuery = "DELETE FROM student WHERE rno = " + rno;
		
		System.out.println("deleteQuery : " + deleteQuery);
		
		Statement stmt = null; 
		
		Connection conn = DBConnection.getConnection();

		if (conn != null) 
		{
			
			try
			{
				stmt = conn.createStatement(); 

				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao : deleteStudent() Db not Connected");
		}
		return rowsAffected;
	}
	// Select SQL Query---Student
	public void getAllStudents() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno Which you want to delete Student : ");
		int rno = sc.nextInt();
		
		StudenDao dao = new StudenDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succesfully Deleted");
		} else 
		{
			System.out.println("Student record not Deleted");
		}
		
// -------------DELETE Student-------------------------		
		
		
// -------------INSERT Student-------------------------		
/*
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
//		sbean.setName(name);
//		sbean.setStd(std);
//		sbean.setMarks(marks);		
		
		StudenDao dao = new StudenDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succesfully Inserted");
		} else 
		{
			System.out.println("Student record not Inserted");
		}
*/	
	}
}