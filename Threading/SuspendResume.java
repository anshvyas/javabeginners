  
	/***********************************************
		Ssuepending and resuming Threads in java2
	
	**************************************************/
  
  package Threading;
  
  class MyThread implements Runnable
	{
	
		Thread t;
		String name;
		boolean myflag=false;
		MyThread(String name)
			{
				this.name=name;
				t=new Thread(this,name);
				System.out.println(t);
				t.start();
			}
			public void run()
			{
				for(int i=15;i>=0;--i)
					{
					try
						{
						Thread.sleep(200);
						System.out.println(this.name+" "+i);
						synchronized(this)
							{
								while(myflag)
								wait();
						
							}
						} catch(InterruptedException e){ System.out.println(this.name+"interrupted");}	
					}
					System.out.println(this.name+"Exiting");
				}	
					
				public void suspend()
					{
						myflag=true;
					}
				synchronized public void resume()
					{
						myflag=false;
						notify();
					}
	
	}
	
	class SuspendResume
		{
			public static void main(String []args)
				{
					MyThread ob1=new MyThread("One");
					MyThread ob2=new MyThread("Two");

						try
							{
								Thread.sleep(1000);
								ob1.suspend();
								System.out.println("Thread One Suspended");
								Thread.sleep(1000);
								ob1.resume();
								System.out.println("Thread One resumed");
								Thread.sleep(1000);
								ob2.suspend();
								System.out.println("Thread Two Suspended");
								Thread.sleep(1000);
								ob2.resume();
								System.out.println("Thread Two resumed");								
							
							}
						catch(InterruptedException e){ System.out.println("Interrupted");}
							try
							{
								ob1.t.join();
								ob2.t.join();
								System.out.println("Main Thread Exiting");
							}
							catch(InterruptedException e){System.out.println("Interrupted");}
				
				}
		
		
		}