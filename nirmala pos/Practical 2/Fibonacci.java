
import java.io.*;
class Fibonacci extends Thread
{
	public static void main(String args[])
	{
		try
		{
			Fibonacci fib=new Fibonacci();
			fib.start();
			fib.sleep(4000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void run()
	{
		try
		{
			int a=0,b=1,c=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the limit for Fibonacci:");
			
			int n= Integer.parseInt(br.readLine());
			System.out.println("/n=====================");
			System.out.println("fibonacci series:");
			while(n>0)
			{ 
				System.out.println(c+" ");
				a=b;
				b=c;
				c=a+b;
				n=n-1;
			}
		}
	
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}