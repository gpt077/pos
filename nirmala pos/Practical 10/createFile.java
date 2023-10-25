
import java.io.*;
public class createFile
{
	public static void main(String[] args)
	{
		try
		{
			//File file= new File("Tanmai.txt");
			File file= new File("C:\\Users\\Admin\\Documents\\mayur1.txt");
			if(file.createNewFile())
			{
				System.out.println("New File is Created.");
			}
			else 
			{
				System.out.println("New File is Created.");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
		
				