  package Threading;
  
  class CallMe
	{
		public void call(String msg)
			{
					System.out.print("["+msg);
						try
							{
								Thread.sleep(2000);
							}
						catch(InterruptedException e)
							{
								System.out.println("Interruption caught");
							}
					System.out.println("]");
			}
	
	
	}
	
	class Caller implements Runnable
		{
		
			CallMe targ;
			String conv;
			Thread t;
				Caller(CallMe target,String s)
				{
					targ=target;
					conv=s;
					t=new Thread(this);
					t.start();
				}
			public void run()
				{
					targ.call(conv);
				}
		
		}
		
		class SyncDemo
			{
				public static void main(String []args)
					{
					
					System.out.println("WE Recive a wrong output here \n");
						CallMe obj=new CallMe();
						Caller obj1=new Caller(obj,"Hello");
						Caller obj2=new Caller(obj,"Sync");
						Caller obj3=new Caller(obj,"World");
						
						try	
							{
								obj1.t.join();
								obj2.t.join();
								obj3.t.join();
							}
						catch(InterruptedException e)
							{
								System.exit(0);
							}
					
					}
			
			}