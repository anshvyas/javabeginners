 package Threading;
 /********************************************************
 
          Use of wait and notify methods for interthred communication
 
**********************************************************/

class Q
	{
		int n;
		boolean flag=false;
		
		 synchronized public void put(int n)
			{
				
				if(flag)
					{
						try
						{
							wait();
						}
						catch(InterruptedException e)
							{
								e.printStackTrace();
							}
					}
				this.n=n;
				System.out.println("Producer:"+n);
				flag=true;
				notify();
			}
			
		synchronized public int get()
			{
			
				if(!flag)
					{
						try
						{
							wait();
						}
						catch(InterruptedException e)
							{
								e.printStackTrace();
							}
					}
					System.out.println("Consumer:"+n);
					flag=false;
					notify();
					return n;
			}
	}
	
	
	
	class Producer implements Runnable
		{
			Q q;
			int i=0;
			Producer(Q q)
				{
					this.q=q;
					new Thread(this,"Producer").start();
				}
				@Override
				public void run()
					{
						while(true)
						{
							q.put(i++);
						try
							{
								Thread.sleep(1000);
							}
						catch(InterruptedException e)
							{
								e.printStackTrace();
							}
						}
					}
		
		}
		
		class Consumer implements Runnable
			{
				Q q;
				Consumer(Q q)
					{
						this.q=q;
						new Thread(this,"Consumer").start();
					}
					@Override
					public void run()
						{
							while(true)
							{
							q.get();
							try{ Thread.sleep(1000);}
							catch(InterruptedException e){e.printStackTrace();}
							}
						}
						
			
			
			}
			
			public class PCFixed
				{
					public static void main(String []args)
						{
							Q q=new Q();
							new Producer(q);
							new Consumer(q);
							System.out.println("CLT-C to Exit");
						}
				
				}