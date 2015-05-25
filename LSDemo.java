	class LinkStack
	{
	
		protected Node head;
		protected int size;
		
		private class Node 
		{
				String data;
				Node link;
		Node(String val,Node lnk)
			{
				setData(val);
				setLink(lnk);
			}
		public void setData(String dta){this.data=dta;}	
		public void setLink(Node lnk){this.link=lnk;}
		public String getData(){return (this.data);}
		public Node getLink(){return (this.link);}	
		}	
		
		LinkStack()
		{ head=null;size=0;}
		
		public void push(String new_val)
			{
				Node last=head;
				head=new Node(new_val,null);
				head.setLink(last);
				++size;
			}
			
		public String pop()
			{
			if(size==0) throw new UnsupportedOperationException("Stack Underflow");
			String value=head.getData();
			head=head.getLink();
				--size;
				return value;
			}
		public int size()
			{return size;}
		public boolean isEmpty()
			{ return (size==0);}
		public String peek()
			{if(size==0) throw new UnsupportedOperationException("Stack Empty");
				return head.getData();
			}
	}	
	class LSDemo
	{
	public static void main(String []args)
		{
			LinkStack s=new LinkStack();
			System.out.println("Is the Stack Empty???? "+s.isEmpty());
			String str[]={"To","Be","Not","To","BE"};
			for(int i=0;i<args.length;++i)
				s.push(args[i]);
				System.out.println();
				System.out.println("Is the Stack Empty???? "+s.isEmpty());
				System.out.println("Size="+s.size());
			try
			{
				while(true)
					{
						System.out.println();
						System.out.println("Head="+s.peek());
						System.out.println("Element poped="+s.pop());
						System.out.println("Size="+s.size());
					}
			}
			catch(Exception e){System.out.println(e);System.out.println("Size="+s.size());}
		}
	}	