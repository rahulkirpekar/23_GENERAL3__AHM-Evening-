package iofiletopic.byteorientedway.seri;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		try
		(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_GENERAL3__AHM(Evening)\\r1.txt"); 		
				
				ObjectInputStream oin = new ObjectInputStream(fin);
		)
		{
			Student s[] = (Student[])oin.readObject();
			
			for (int i = 0; i < s.length; i++) 
			{
				s[i].dispData();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
