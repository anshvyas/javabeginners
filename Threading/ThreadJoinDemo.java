	package Threading;
	class ThreadJoin implements Runnable
		{
			Thread t;
			String name;
			ThreadJoin(String name)
				{
					this.name=name;
					t=new Thread(this,name);
					System.out.println("Thread :"+t);
					t.start();
				}
			public void run()
				{
					try
					{
					for(int i=5;i>=0;--i)
						{
							System.out.println("Thread: "+this.name+":"+i);
							Thread.sleep(1000);
						}
					}
					
					catch(InterruptedException e)
						{
							System.out.println("Thread :"+this.name+" interrupted");
						}
					System.out.println("Thread :"+this.name+"exiting");	
				}
				
		}
		
		class ThreadJoinDemo
			{
				public static void main(String []args)
					{
						ThreadJoin ob1=new ThreadJoin("One");
						ThreadJoin ob2=new ThreadJoin("Two");
						ThreadJoin ob3=new ThreadJoin("Three");
						
						System.out.println("Thread One is Alive:"+ob1.t.isAlive());
						System.out.println("Thread Two is Alive:"+ob2.t.isAlive());
						System.out.println("Thread Three is Alive:"+ob3.t.isAlive());
						
						try
							{
								ob1.t.join();
								ob2.t.join();
								ob2.t.join();
							
							}
							
						catch(InterruptedException e)
							{
								System.out.println("Interrupted");
							}
							
						System.out.println("Thread One is Alive:"+ob1.t.isAlive());
						System.out.println("Thread Two is Alive:"+ob2.t.isAlive());
						System.out.println("Thread Three is Alive:"+ob3.t.isAlive());
						System.out.println("Exiting Main Thread");
					}
			
			}