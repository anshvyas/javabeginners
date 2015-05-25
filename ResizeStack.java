	class Stack
		{
			private String stack[];
			private int size;
			Stack(){ stack=new String[1];size=0;}
			
			public boolean isEmpty(){return (size==0);}
			private void resize(int capacity)
				{
					String stck[]=new String[capacity];
					for(int i=0;i<size;++i)
						stck[i]=stack[i];
						stack=stck;
				}
			public void push(String item)
				{
					if(size==stack.length) resize(2*stack.length);
					stack[size++]=item;
				}
			public int size(){return size;}	
			public String peek(){if(isEmpty()) throw new UnsupportedOperationException("Stack Enmpty");
				return stack[size-1];
			}	
			public String pop()
			{
				if(isEmpty()) throw new UnsupportedOperationException("Stack UnderFlow!!!!");
				if(size>0 && size==stack.length/4) resize(stack.length/2);
				String toreturn=stack[size-1];
				stack[size-1]=null;
				size-=1;
				return toreturn;
			
			}
			class Iterator
			{
				private int head;
				Iterator(){head=size;}
				public boolean hasNext(){return (head!=0);}
				public String next(){return stack[--head];}
				public void remove(){throw new UnsupportedOperationException();}
			}
			public Iterator iterator(){ return new Iterator();}	
			
		}
		
		class ResizeStack
			{
				public static void main(String []args)
					{
						Stack stck1=new Stack();
						System.out.println("Is stack Empty???? "+stck1.isEmpty());
						for(int i=0;i<args.length;++i)
							if(!(args[i].equals("-"))) stck1.push(args[i]);
							System.out.println("Is stack Empty???? "+stck1.isEmpty());
							System.out.println("Size="+stck1.size());
							System.out.println("Head="+stck1.peek());
							System.out.println("Element poped="+stck1.pop());
							System.out.println("Size="+stck1.size());
							System.out.println("Head="+stck1.peek());
						Stack.Iterator itr=stck1.iterator();
							while(itr.hasNext())
							{
								System.out.print(itr.next()+" ");
							}
					}
			
			}