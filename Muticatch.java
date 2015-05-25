	class Multicatch
		{
			public static void main(String []args)
				{
					try
						{
						int a=args.length;
						int c[]={1};
						int res=24/a;
						c[42]=10;
						}
					catch(ArithmeticException e)
						{
							System.out.println("Exception: "+e);
						}
					catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("Exception: "+e);
						}
				}
		
		}