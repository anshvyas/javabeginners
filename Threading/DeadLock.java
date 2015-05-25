	package Threading;
	
	class DeadLock
		{
			static class Friend
				{
					final String name;
					Friend(String name)
						{
							this.name=name;
						}
						
					public String getName(){ return this.name;}
					
					synchronized public void bow(Friend bower)
						{
							System.out.printf("%s bowed to %s\n",bower.getName(),this.name);
							bower.bowBack(this);
						}
						
					synchronized public void bowBack(Friend bower)
						{
							System.out.printf("%s bowed back to %s\n",this.name,bower.getName());
						}
				}		
						public static void main(String []args)
							{
								final Friend f1=new Friend("Anshul");
								final Friend f2=new Friend("Ashu");
								
								new Thread( new Runnable(){
									public void run(){f1.bow(f2);}
								}).start();
								
								new Thread(new Runnable(){
									public void run(){f2.bow(f1);}
								
								}).start();
							
							}
		
		
		}