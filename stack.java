		class Stack_int
			{
				private int push;
				private	int stack[]=new int[10];
					void init(int n){ push=-1;}
					int stack_push(int i)
					{if(push==9)
							{
						System.out.println("Stack overflow!!!!!");
								return 0;
							}
						else
						return stack[++push]=i;
					}
			
			}
			
		class stack
		{
			public static void main(String []args)
				{
					Stack_int stck=new Stack_int();
					stck.init(10);
					for(int i=0;i<10;++i)
					System.out.println(stck.stack_push(i));
				
				}
		}	