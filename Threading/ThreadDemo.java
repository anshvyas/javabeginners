   package Threading;
   class NewThread implements Runnable
	{
		NewThread()
			{
				Thread thr=new Thread(this,"Demo Thread");
				System.out.println("Child Thread: "+thr);
				thr.start();
			
			}
		public void run()
			{
				try
					{
						for(int i=5;i>=0;--i)
							{
								System.out.println("Child Thread: "+i);
								Thread.sleep(200);
							}	
					
					}
				catch(InterruptedException e)
					{ System.out.println(" Child Thread Interrrupted");}
			
				System.out.println("Exiting Child Thread");
			}
	
	}
	
	public class ThreadDemo
		{
			public static void main(String []args)
				{
				new NewThread();
					try
						{
							for(int i=5;i>=0;--i)
							{
								System.out.println("Main Thread: "+i);
								Thread.sleep(1000);
							
							}
						
						}
						catch(InterruptedException e)
							{
							System.out.println("Main Thread Interrupted");
							}
					System.out.println("Existing Main Thred");
				}
		
		}