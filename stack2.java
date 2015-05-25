	class init
		{
			private int stck[];
			private int pos;
			init(int n)
				{
					pos=-1;
					stck=new int[n];
				}
			void push(int item)
				{  ++pos;
					if(pos>=stck.length)
					System.out.println("Stack overflow!!!!!");
					else
						{
					stck[pos]=item;
					System.out.println("Element as position "+pos+" is "+stck[pos]);
						}
				}
		}
		
	class stack2
		{
			public static void main(String []args)
				{
					init stack=new init(10);
					for(int i=1;i<=10;++i)
					stack.push(i);
				}
		
		
		}