  package Threading;
  import java.io.*;
  public class MainThread
	{
		public static void main(String []args) throws IOException
			{
				Thread th=Thread.currentThread();
				System.out.println("Current Thread "+th);
				th.setName("The Main Thread");
				System.out.println("Current Thread now "+th);
				try
				{
					for(int i=5;i>=0;--i)
						{
							System.out.println(i);
							Thread.sleep(2000);
						}
				
				}
				catch(InterruptedException e)
					{
						System.out.println("Thread Interrupted");
					}
			
			}
	}