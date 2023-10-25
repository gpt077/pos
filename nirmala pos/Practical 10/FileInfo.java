
import java.io.File;
class FileInfo
{
	public static void main(String[] args)
	{
	
		File f0= new File("C:\\\\Users\\\\Admin\\\\Documents\\\\gmi.txt");
		//File file= new File("E:\TanmaiA-41\pract10\Tanmai.txt");
		if(f0.exists())
		{
			System.out.println("File Name:"+f0.getName());
			System.out.println("File Path:"+f0.getAbsolutePath());
			System.out.println("Is File Writeable? "+f0.canWrite());
			System.out.println("Is File Readable? "+f0.canRead());
			System.out.println("File Size:"+f0.length());
		}
		else
		{
			System.out.println("File does not exists.");
		}	
	}
}
		
		