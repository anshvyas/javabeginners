	class Hello1
		{
			int a;
			int b;
			Hello1(int x,int y)
			{
				a=x;
				b=y;
				System.out.println("a-b= "+(a-b));
			}
		void show()
			{
			System.out.println("a="+a+"b= "+b+"Result obtained!!!!");
			}
		
		}
	class Hello
	{
		public static void main(String[]arjit)
			{
		//Hello1 h1=new Hello1();
		Hello1 h2=new Hello1(5,3);
		h2.show();
			}
	}	