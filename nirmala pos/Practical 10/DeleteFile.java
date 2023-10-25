
import java.io.File;
class DeleteFile
{
	public static void main(String[] args)
	{
	
		File f0= new File("Naruto.txt");
		//File file= new File("E:\TanmaiA-41\pract10\Tanmai.txt");
		if(f0.delete())
		{
			System.out.println("File is Deleted Successfully.");
			
		}
		else
		{
			System.out.println("Unexcepted error found in deletion of the file.");
		}	
	}
}
		
		