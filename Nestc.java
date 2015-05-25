// Nesting of try statements -----------------=>
	class Nestc
		{
			public static void main(String []args)
				{
					try
						{
							int a=args.length;
							int c[];
							System.out.println("a= "+a);
							int b=42/a;
						try
							{
								if(a==1)
								a=a/(a-a);
								else if(a==2)
								{
									c=new int[a];
									c[10]=15;
								}
							}
							catch(ArrayIndexOutOfBoundsException e)
								{
									System.out.println("!!!!!!!"+e);
								}
						}
							catch(ArithmeticException e)
							{
								System.out.println("!!!!!!!"+e);
							}
				
				
				}
		}