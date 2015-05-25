	class Supsubctch
		{
			public static void main(String []args)
				{
					try
						{
							int l=args.length;
							int res=42/l;
						}
					//superclass first...subclass afterwards!!!!!!Wrong!!!!!!	
					/*catch(Exception e)
						{
							System.out.println("!!!!!!!!"+e);
						}
					catch(ArithmeticException e)
						{
							System.out.println("!!!!!!!!"+e);
						}*/
						
						
					catch(ArithmeticException e)
						{
							System.out.println("!!!!!!!!"+e);
						}
					catch(Exception e)
						{
							System.out.println("!!!!!!!!"+e);
						}	
				}
		
		
		}