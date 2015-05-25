	class recursion
	{
		long fact(int n)
		{
			long res;
			if(n==1)return 1;
			else
				{
			res=fact(n-1)*n;
			System.out.println("Value : "+res);
				}
				return res;
		}
	
	}
	
	class fact
	{
	
			public static void main(String []args)
			{
		recursion obj=new recursion();
		System.out.println("Factorial of 3 is "+obj.fact(10));
			}
	}