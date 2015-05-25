	class ThrowD
		{
			 static void throwd()
			{
			try
				{
					throw new NullPointerException("!!!!!Caught");
				}
			catch(Exception e)
				{
					System.out.println(e+"Caught in function");
					throw e;
				}
			}	
			
			public static void main(String []args)
				{
					try
						{
						 throwd();
						}
					catch(Exception e)
						{
							System.out.println(e+"Recught");
						}
				}
			
		}