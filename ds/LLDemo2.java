	 class SLinkList
		{
			private class Node
				{
					private int data;
					private Node link;
					
					Node()
						{
						data=0;
						head=null;
						}
					Node(int newdata,Node newlink)
						{
							setData(newdata);
							link=newlink;
						}
					void setData(int new_data){data=new_data;}
					void setLink(Node new_link){link=new_link;}
					int getData(){return data;}
					Node getLink(){return link;}
				}
		protected Node head;
			SLinkList(){head=null;}
			public void addToHead(int value){head=new Node(value,head);}
			public int size()
			{
				Node pos=head;
				int count=0;
				while(pos!=null)
					{
						count++;
						pos=pos.getLink();
					}
				return count;	
			}
			public void addToLast(int value)
				{
					Node pos=head;
					if(head==null) {addToHead(value);}
					else
					{
						while(pos!=null)
						pos=pos.getLink();
						pos.link=new Node(value,pos.getLink()) ;
						return ;
					}
				}
			public void display()
				{
					Node pos=head;
					while(pos!=null)
					{
					System.out.print(pos.getData()+"<-");
					pos=pos.getLink();
					}
					System.out.println("Null");
					
				}
			public void insertAfter(int key,int toins)
				{
					Node pos=head;
					while(pos!=null && pos.getData()!=key)
						{
							pos=pos.getLink();
						}
					if(pos!=null)
					pos.link=new Node(toins,pos.link);
				}
			public void insertBefore(int key ,int toins)
				{
					Node prev=null;
					Node curr=head;
					if(curr==null)return ;
					if(head.getData()==toins)
					{
					addToHead(toins);
					return ;
					}
					while(curr!=null && curr.getData()!=key)
						{
							prev=curr;
							curr=curr.getLink();
						}
					if(curr!=null)	
						{
							prev.link=new Node(toins,curr);
						}
				}	
				public void deleteNode(int key)
					{
						
						Node prev=null;
						Node curr=head;
						if(curr.getData()==key)
							{
								head=curr.link;
								return ;
							}
						  if(curr == null) return;	
						while(curr!=null && curr.getData()!=key)
							{
								prev=curr;
								curr=curr.getLink();
							}
						if(curr!=null)
							{
								prev.link=curr.link;
							}
					}
					
				
		}
		class LLDemo2
		{
		
			public static void main(String []args)
			{
			SLinkList lst=new SLinkList();
			for(int i=1;i<=10;++i)
				{
				lst.addToHead(i);
				}
			lst.display();
			//lst.addToLast(0);
			System.out.println(lst.size());
			lst.insertAfter(5,11);
			lst.insertBefore(4,12);
			lst.display();
			lst.deleteNode(6);
			lst.display();
			}	
		
		
		}
	
		
		
		