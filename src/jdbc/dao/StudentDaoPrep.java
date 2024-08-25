package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

public class StudentDaoPrep 
{
	public  int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0 ;
		
		PreparedStatement pstmt = null;
		
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);

				
				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				
				rowsAffected = pstmt.executeUpdate();
				
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep :insertStudent(StudentBean sbean) -- Db not connected : " + conn);
		}
		return rowsAffected;
	}
	public  int updateStudent(StudentBean sbean,int rno) 
	{
		int rowsAffected = 0 ;
		
		String updateQuery = "UPDATE student SET name=?, std=? , marks=? WHERE rno = ?";

		System.out.println("updateQuery : " + updateQuery);
		
		PreparedStatement pstmt = null;
		
		Connection conn = DBConnection.getConnection();
		
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);

				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudenDaoPrep : updateStudent() Db not connected");
		}
		return rowsAffected;	}
	public  int  deleteStudent(int rno) 
	{
		int rowsAffected = 0 ;
		
		String deleteQuery = "DELETE FROM student WHERE rno = ?";
		
		System.out.println("deleteQuery : " + deleteQuery);
		
		PreparedStatement pstmt = null; 
		
		Connection conn = DBConnection.getConnection();

		if (conn != null) 
		{
			
			try
			{
				pstmt = conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1, rno);

				rowsAffected = pstmt.executeUpdate();
				
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
	public ArrayList<StudentBean> getAllStudents() 
	{
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		ResultSet rs = null;
		
		String selectQuery = "SELECT rno,name,std,marks FROM student";
		
		PreparedStatement pstmt = null;
		
		Connection conn = DBConnection.getConnection();
		
		StudentBean sbean =  null;
		
		if (conn != null) 
		{
			try 
			{
				
				pstmt = conn.prepareStatement(selectQuery);

				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
//---FirstWay to fetch data from resultset 

//					int rno = rs.getInt("rno");
//					String name =  rs.getString("name");      
//					String std =  rs.getString("std");
//					int marks = rs.getInt("marks");
//---SecondWay
					int rno = rs.getInt(1);
							
					String name =  rs.getString(2);      

					String std =  rs.getString(3);
					
					int marks = rs.getInt(4);
					
//					System.out.println(rno+" " + name+" " + std+" " + marks);
				
					sbean =  new StudentBean(rno, name, std, marks);
					
					
					list.add(sbean);
				}
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudenDaoPrep : getAllStudents() Db not connected");
		}
		
		return list;
	}
	public static void main(String[] args) 
	{
		StudentDaoPrep dao = new StudentDaoPrep();
		int rowsAffected = 0; 
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentBean> list = dao.getAllStudents();
		
		while(true) 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Display All Student records ");
			System.out.println("5) For Exit Application");
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1: 
						// -------------INSERT Student-------------------------		
						sc.nextLine();
						System.out.println("Enter Name : ");
						String name = sc.nextLine();
						System.out.println("Enter Std : ");
						String std = sc.nextLine();
						System.out.println("Enter Marks : ");
						int marks = sc.nextInt();
						
						StudentBean sbean = new StudentBean(0, name, std, marks);
						
						rowsAffected = dao.insertStudent(sbean);
						
						if (rowsAffected > 0) 
						{
							System.out.println("Student record succesfully Inserted");
						} else 
						{
							System.out.println("Student record not Inserted");
						}
						break;
				case 2:
						// -------------UPDATE Student-------------------------				
						System.out.println("Enter Rno Which you want update Student record : ");
						int rno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Name : ");
						name = sc.nextLine();
						System.out.println("Enter Std : ");
						std = sc.nextLine();
						System.out.println("Enter Marks : ");
						marks = sc.nextInt();
						
						sbean = new StudentBean(0, name, std, marks);
						
						rowsAffected = dao.updateStudent(sbean,rno);
						
						if (rowsAffected > 0) 
						{
							System.out.println("Student record succesfully Updated");
						} else 
						{
							System.out.println("Student record not Updated");
						}
						break;
				case 3: 
						// -------------DELETE Student-------------------------		
						System.out.println("Enter Rno Which you want to delete Student : ");
						rno = sc.nextInt();
						
						rowsAffected = dao.deleteStudent(rno);
						
						if (rowsAffected > 0) 
						{
							System.out.println("Student record succesfully Deleted");
						} else 
						{
							System.out.println("Student record not Deleted");
						}
						break;
				case 4:
						list = dao.getAllStudents();
					
						for (int i = 0; i < list.size(); i++) 
						{
							StudentBean s = list.get(i);
							
							System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
						}
						break;
						
				case 5: System.out.println("Application will be exit."); 
						try 
						{
							Thread.sleep(500);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						System.exit(0);
			}
		}	
	}
}
