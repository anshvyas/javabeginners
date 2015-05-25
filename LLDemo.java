	class Node1
		{
			private int data;
			private Node1 link;
				
			Node1()
			{
				data=0;
				link=null;
			}
			Node1(int newdata,Node1 newlink)
				{
					setData(newdata);
					link=newlink;
				}
			public void setData(int new_data)
				{
				data=new_data;
				}
			public void setLink(Node1 new_link)
				{
				link=new_link;
				}
			public int getData(){return data;}
			public Node1 getLink(){return link;}	
		}
		
		class LinkList1
			{
				private Node1 head; 
				LinkList1(){head=null;}
				public void addToStart(int var)
					{
						head=new Node1(var,head);
					}
				public int size()
					{
					Node1 pos=head;
					int count=0;
					while(pos!=null)
						{
						count++;
						pos=pos.getLink();
						}
					return count;
					}
				public void displayList()
					{
					Node1 pos=head;
					while(pos!=null)
						{
							System.out.print(pos.getData()+"<-");
							pos=pos.getLink();
						}
						System.out.println("null");
					}
				public boolean search(int val)
					{
						return(find(val)!=null);
			
					}
				private Node1 find(int value)
					{
						Node1 pos=head;
						while(pos!=null)
							{
								if(pos.getData()==value)
								return pos.getLink();
								pos=pos.getLink();
								
							}
						return null;	
						
					}
				public boolean deleteHeadNode()
					{
						
						while(head!=null)
							{
								head=head.getLink();
								return true;
							}
						return false;	
					}
			}
		public class LLDemo
			{
			public static void main(String []args)
				{
				LinkList1 list=new LinkList1();
				for(int i=0;i<10;++i)
					{
						list.addToStart(i);
					}
				System.out.println("Size="+list.size());
					list.displayList();
					if(list.search(4))
					System.out.println("Present");
					else 
					System.out.println("Not Found");
					list.deleteHeadNode();
					list.displayList();
					while(list.deleteHeadNode())
						;
					list.displayList();	
				}	
			}
			