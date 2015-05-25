	class outer
		{
			private int out;
				class inner
					{
						private int in;
							inner()
							{
								in=-1;
								out=-1;
								System.out.println("Out= "+out+" In= "+in);
								++in;
								++out;
								System.out.println("Out= "+out+" In= "+in);
							}
					}
			outer()
				{
				inner in=new inner();
				++out;
				System.out.println("Out= "+out+" In= "+in);
				}
		}
		
	class nest
			{
				public static void main(String []args)
					{
				outer out=new outer();
					}
			}
			