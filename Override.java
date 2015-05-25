		//Exception!!
		class sup
			{
				int i,j;
				sup(int i,int j)
					{
						i=i;
						j=j;
					}
				/*void show()
				{System.out.println("i and j are: "+i+" "+j); }		*/		
			}
			
		class sub extends sup
			{
				int k;
				sub(int a,int b,int c)
					{
						super(a,b);
						k=c;
					}
				void show()
				{System.out.println("k="+(k+i+j));
				System.out.println("i and j are: "+i+" "+j);
				}
			}
			
		class Override
			{
				public static void main(String []args)
					{
						sub s1=new sub(10,20,30);
						s1.show();
					
					}
			
			}