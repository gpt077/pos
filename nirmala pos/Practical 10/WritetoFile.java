
import java.io.FileWriter;
import java.io.IOException;

class WriteToFile
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fwrite= new FileWriter("Luffy.txt");
			//File file= new File("E:\TanmaiA-41\pract10\Tanmai.txt");
			fwrite.write("Luffy will be King of Pirates.");
			
			fwrite.close();
			System.out.println("Content Is Sucessfully Written.");
		}
		catch(IOException e)
		{
			System.out.println("Unexpected error occured.");
			e.printStackTrace();
		}
	}
}
		
				