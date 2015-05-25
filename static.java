	class sts
		{
			static int i=0;
			 sts()
				{
					++i;
					System.out.println("Count of objects"+i);
				}
		}
		
	class stat
		{
			public static void main(String []agrs)
				{
			sts obj=new sts();
			sts obj2=new sts();
			sts obj3=new sts();
			sts obj4=obj3;
				}
		}