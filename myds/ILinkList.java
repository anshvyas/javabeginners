
package myds;
public class ILinkList
		{
			private class Node
				{
					private String data;
					private Node link;
					
					Node()
						{
							data =null;
							link=null;
						}
					Node(String newdata,Node newlink)
						{
							setData(newdata);
							link=newlink;
						}
						
					public void setData(String new_data)
						{
							data=new_data;
						}
					public void setLink(Node new_link)
						{
							link=new_link;
						}
					public String getData(){return data;}
					public Node getLink(){return link;}	
				}
			protected Node head;
			public void addToStart(String val)
			{head=new Node(val,head);}
			public ILinkList(){head=null;}
			class Iterator2List
				{
					private Node prev,pos;
					Iterator2List()
						{
							pos=head;
							prev=null;
						}
					public void restart()
						{
						pos=head;
						prev=null;
						}
					public String next()
						{
							if(head==null) return null;
							String toreturn=pos.getData();
							prev=pos;
							pos=pos.getLink();
							return toreturn;
						}
					public boolean hasNext()
						{
							return(pos!=null);
						}
					
					public void addHere(String newval)
						{
							prev.link=new Node(newval,pos);
						}
					public void changeHere(String chval)
						{
							pos.setData(chval);	
						}
					public void delete()
						{
							if(pos==null)return ;
							prev.link=pos.getLink();
						}
					/*public void dispaly()
						{
							while(pos!=null)
								{
									System.out.print(pos.getData()+"<-" );
								}
							System.out.println("null");	
						}*/
				}
			public Iterator2List iterator()
						{
							return new Iterator2List();
						}	
		
		
		
		}