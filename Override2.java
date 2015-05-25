		// use of super and method overriding
		class sup
			{
				int i,j,k;
				sup(int x,int y)
					{
						i=x;
						j=y;
					}
				void show()
				{System.out.println("i,j and k are: "+i+" "+j+" "+k); }				
			}
			
		class sub extends sup
			{
				int k;
				sub(int a,int b,int c)
					{
						super(a,b);
						k=c;
						super.k=a+b;
					}
				void show()
				{
						super.show();
					System.out.println("k="+k);
				}
			}
			
		class Override2
			{
				public static void main(String []args)
					{
						sub s1=new sub(10,20,30);
						System.out.println("Method Overridden is: ");
						s1.show();
					}
			
			}