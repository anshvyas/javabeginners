package Threading;

class ThreadPrio implements Runnable
	{
		Thread t;
		int count=0;
		private volatile boolean clck=true;
		ThreadPrio(int p)
			{
				t=new Thread(this);
				t.setPriority(p);			
			}
			
			public void run()
				{
					while(clck)
					++count;
				}
			public void start()
				{
					t.start();
				}
				
				public void stop()
					{
						clck=false;
					}
	}
	
	class ThreadPrioDemo
		{
			public static void main(String []args)
				{
					Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
					ThreadPrio low=new ThreadPrio(Thread.NORM_PRIORITY-2);
					ThreadPrio high=new ThreadPrio(Thread.NORM_PRIORITY+2);
					low.start();
					high.start();
					
					try
						{
							Thread.sleep(10000);
						}
						catch(InterruptedException e)
							{
								System.out.println("Main Thread Interrupted");
							}
						low.stop();
						high.stop();	
						try	{
						low.t.join();
						high.t.join();	
							}
						catch(InterruptedException e)
							{System.out.println("Caught!!!!!");}
							
						System.out.println("Counter for low: "+low.count);
						System.out.println("Counter for High:"+high.count);
						System.out.println("Exiting Main Thread");						
				}
		
		}