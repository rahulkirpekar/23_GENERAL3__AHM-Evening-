package iofiletopic.byteorientedway.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_GENERAL3__AHM(Evening)\\src\\iofiletopic\\byteorientedway\\TestApp1.java");

			FileOutputStream fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\23_GENERAL3__AHM(Evening)\\src\\iofiletopic\\byteorientedway\\task1\\dupTestApp1.java");
			
			int temp ;
			
			while(	(temp = fin.read())	!= -1) 
			{
				System.out.print((char)temp);
				
				fout.write(temp);
			}
			fin.close();
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}