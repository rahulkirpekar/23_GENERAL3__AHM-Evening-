package iofiletopic.byteorientedway;

import java.io.FileInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		// Read--byte orientedway ---Data(Textfile)
		try 
		{
			// fin---connection
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_GENERAL3__AHM(Evening)\\guj1.txt");
			
			int temp;
			
			while(	(temp = fin.read())	 != -1) 
			{
				char value = (char)temp;
				
				sb.append(value);
			}
			
			fin.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String  : " + sb);
	}
}
