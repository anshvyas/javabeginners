	class sup
			{
				int i,j;
				sup()
				{
					i=j=10;
					i*=j;
					j=i*i;
				}
			void show()
					{
						System.out.println("In Subclass:");
						System.out.println("i= "+i+" j= "+j);
					}
			}
		
	class sub extends sup
			{
			
				int k;
				sub()
				{k=10;}
				void change()
				{
					i*=k;
					j*=k;
					
					System.out.println("In Superclass:");
					System.out.println("i= "+i+" j= "+j+" k= "+k);
				}
				
			}
			
	class inhit
			{
				public static void main(String []args)
					{
				sup s1=new sup();
				sub s2=new sub();
				s1.show();
				s2.show();
				s2.change();
					}
			}
			