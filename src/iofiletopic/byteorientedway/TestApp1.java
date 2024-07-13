package iofiletopic.byteorientedway;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// String --- > write ---> [ByteOrientedWay] --->FileOutputStream
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// data -- read <----console
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		// name ---> write -- -file
		try 
		{
			// file connection
			FileOutputStream fout  = new FileOutputStream("guj1.txt");
			
			byte b[] = name.getBytes();
			
			// String -- byte[]-
			// data -- byte[]
			fout.write(b);
			
			// file connection close
			fout.close();
			
			System.out.println("success");
			
		}catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}