	class ThrowsD
		{
			static void throwsd() throws IllegalAccessException,NullPointerException
				{
					System.out.println("Inside function!!!!!");
					//throw new IllegalAccessException("!!!!!!Caught");
					throw new NullPointerException("!!!!!Caught_2");
				}
		
			public static void main(String []agrs)
				{
					try
					{
						throwsd();
					}
					catch(NullPointerException e)
					{
					System.out.println(e+"Caught");
					}
					catch(IllegalAccessException e1)
					{
					System.out.println(e1+"Caught");
					}
				}
		
		}