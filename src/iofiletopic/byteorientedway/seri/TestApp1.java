package iofiletopic.byteorientedway.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student obj = new Student(1, "rahul", 12);
		
		
		// Data --obj ---write---file
		// Autoclosable Resource--[try..catch]
		try
		(
				FileOutputStream fout = new FileOutputStream("studentrcd.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
		) 
		{
			out.writeObject(obj);// JVM--->

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









