
/**
LinkLIST With Iterator
*/
	class LinkList
		{
			private class Node
				{
					String data;
					Node link;
					Node()
					{
						data=null;
						link=null;
					}
					Node(String newdata,Node newlink)
					{
						setData(newdata);
						link=newlink;
					}
					
					public void setData(String new_data){data=new_data;}
					public void setLink(Node new_link){link=new_link;}
					public String getData(){return data;}
					public Node getLink(){return link;}
				}
			protected Node head;
			LinkList()
			{
			head=null;
			}
			 class Iterator2List
				{
					Node prev,pos;
					Iterator2List(){prev=null;pos=head;}
					public void restart(){prev=null;pos=head;}
					public int size(){int count=0;while(pos!=null){count++;pos=pos.getLink();} restart();return count;}
					public void display(){while(pos!=null){System.out.print(pos.getData()+" <-");pos=pos.getLink();} System.out.println("null"); restart();}
					public boolean hasNext(){return(pos!=null);}
					public String next(){if(pos==null)return"null";if(hasNext()){prev=pos;pos=pos.getLink();}return (prev.getData());}
					public void addAfter(String key,String value){while(pos!=null && pos.getData()!=key){prev=pos;pos=pos.getLink();}
					pos.link=new Node(value,pos.getLink());
					restart();
					}
					public void addBefore(String key,String value){ while(pos!=null && pos.getData()!=key){prev=pos;pos=pos.getLink();}prev.link=new Node(value,pos);restart();}
					
					public void delete(String value){if(pos==null) return; while(pos.getData()!=value){prev=pos;pos=pos.getLink();}prev.link=pos.getLink();restart();}
				
				}
				public Iterator2List itr(){return new Iterator2List();}
				public void addHead(String value){head=new Node(value,head);}
		
		}
		
		class LLDemo4
			{
				public static void main(String []args)
					{
						LinkList list=new LinkList();
						LinkList.Iterator2List i=list.itr();
						String sample[]={"Apples","Mangoes","Pineapples","Guava","Orange"};
						for(int j=0;j<sample.length;++j)
							{
								list.addHead(sample[j]);
							}
						i.restart();
						i.display();	
						System.out.println("Size="+i.size());
						i.addAfter("Pineapples","tomatoes");
						i.display();
						i.addBefore("Guava","Chillies");
						i.display();
						System.out.println("Size="+i.size());
						i.delete("Apples");
						i.display();
						System.out.println("Size="+i.size());
						while(i.hasNext()){System.out.print(i.next()+"<-");}
						System.out.println("null");
						i.restart();
						
					}
			
			}