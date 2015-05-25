 import java.util.*;	
	class Queue
		{
			private class Node
				{
					private int data;
					private Node link;
					
					Node()
						{
							data=0;
							link=null;
						}
					Node (int newdata,Node newlink)
						{
							setData(newdata);
							link=newlink;
						}
						
					public void setData(int new_data)
						{
							this.data=new_data;
						}
					public void setLink(Node new_link)
						{
							this.link=new_link;
						}
					public int getData(){return data;}
					public Node getLink(){return link;}
				}
			protected Node head,tail;
			protected int size;
			
			Queue()
			{
				head=null;
				tail=null;
				size=0;
				
			}
		public void insert(int value)
			{
				Node nptr=new Node(value,null);
				if(tail==null)
					{
						head=nptr;
						tail=nptr;
					}
				else
					{
						tail.setLink(nptr);
						tail=nptr;
					}
				++size;	
			}
		public boolean isEmpty()
			{
				return (head==null);
			}
		public void remove()
			{
				if(isEmpty()) throw new IllegalArgumentException("Can't remove");
						
						head=head.getLink();
						--size;
						if(head==null)
							tail=null;
					
			}
			
		public int peek()
			{
				if(isEmpty()) throw new NoSuchElementException("Empty!!!");
				return head.getData();
			}
		public int size()
			{
				return size;
			}
		public void display()
			{
				Node ptr=head;
				if(isEmpty()) throw new NoSuchElementException("Empty");
				while(ptr!=tail.getLink())
					{
						System.out.print(ptr.getData()+" ");
						ptr=ptr.getLink();
					}
				System.out.println();	
			}
		}
		
	public class QDemo
		{
		public static void main(String []args)
			{
			Queue q=new Queue();
			for(int i=1;i<=10;++i)
				q.insert(i);
				System.out.println("Size= "+q.size());
				q.display();
				q.remove();
				System.out.println("Size= "+q.size());
				q.display();
				while(!(q.isEmpty()))
				q.remove();
				System.out.println("Size= "+q.size());
				q.display();
			}	
		}