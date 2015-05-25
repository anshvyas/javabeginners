	class Exp
	{
		static void exp()
			{
		int d=0;
		int res=42/d;
			}
	}
	
	class Expc
	{
		public static void main(String []args)
			{	try
					{
				Exp.exp();
					}
				catch(ArithmeticException e)
					{
						System.out.println("Divide by Zero!!!!!");
					}
			}
	
	}