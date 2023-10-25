
class Single extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running");
	}
	public static void main(String args[])
	{
		Single t1=new Single();
		t1.start();
	}
}