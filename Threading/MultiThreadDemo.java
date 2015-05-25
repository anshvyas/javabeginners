package Threading;

class MultiThread implements Runnable
	{
		String thrname;
		MultiThread(String name)
			{
				thrname=name;
				Thread thr=new Thread(this,name);
				System.out.println("Thread: "+thr);
				thr.start();
			}
			
		public void run()
			{
				try
				{
				for(int i=5;i>=0;--i)
					{
						System.out.println(this.thrname +":"+ i);
						Thread.sleep(1000);
					}
				}
				catch(InterruptedException e)
				{System.out.println(this.thrname+" Interrupted");}
				System.out.println("Existing "+this.thrname);
			
			}
	
	}
	
	public class MultiThreadDemo
		{
			public static void main(String []args)
				{
					new MultiThread("One");
					new MultiThread("Two");
					new MultiThread("Three");
					//new MultiThread("Four");
					
					try
						{
								{
									System.out.println(Thread.currentThread().getName());
									Thread.sleep(10000);
								}
						
						}
					catch(InterruptedException e)
					{	System.out.println("Main Thread Interrupted"); }
						System.out.println("Existing Main");
				}
		
		
		}