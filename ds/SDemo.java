	class Stack
		{
			private String []stck;
			private int size;
				public Stack(int max){stck=new String[max];size=0;}
				public boolean isEmpty(){ return (size==0);}
				public void push(String item){ if(size==stck.length) throw new UnsupportedOperationException("Can't push the element"); 
				
					stck[size++]=item;
				}
				public String pop(){ if (size==0) throw new UnsupportedOperationException("Can't delete!!!");
				String res=stck[size-1];
					stck[--size]=null;
					return res;
					}
				public String peek(){return stck[size-1];}
				public int size(){return size;}
		}
		
	class 	SDemo
		{
			public static void main(String []args)
				{
					Stack st=new Stack(5);
					String topush[]={"To","Be","Not","To","Be"};
					for(int i=0;i<topush.length;++i)
						st.push(topush[i]);
							System.out.println("Size="+st.size());
							try
							{
						st.push("!!!!");
							}
							catch(Exception e)
								{
									System.out.println(e);
									System.out.println();
								}
							finally
							{
						System.out.println("Size="+st.size());
						while(!(st.isEmpty()))
							{
						System.out.println("head="+st.peek());
						System.out.println("Poped Element="+st.pop());
						System.out.println("Size="+st.size());
						System.out.println();
							}
							}
							try
							{
						System.out.println(st.pop());
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
				}
		
		}