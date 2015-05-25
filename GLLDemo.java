	class GLinkedList<T>
		{
			private class Node<T>
				{
					 T data;
					Node<T> pre,post;
					Node()
						{
							this.data=null;
							this.pre=null;
							this.post=null;
						}
					Node(T data,Node<T> pre,Node<T> post)
						{
							this.data=data;
							this.pre=pre;
							this.post=post;
						}
						
					public void setData(T data){this.data=data;}
					public void setPre(Node<T> pre){this.pre=pre;}
					public void setPost(Node<T> post){this.post=post;}

					public T getData(){return this.data;}
					public Node<T> getPre(){return this.pre;}
					public Node<T> getPost(){return this.post;}	
				}
		
				protected Node<T> header,tailer;
				protected int size;
					GLinkedList()
						{
							header=new Node<T>(null,null,null);
							tailer=new Node<T>(null,header,null);
							header.setPost(tailer);
							size=0;
						}
				public void addToHead(T newdata)
						{
							Node<T> n=new Node<T>(newdata,null,null);
							Node<T> curr=header.getPost();
							header.setPost(n);
							n.setPre(header);
							n.setPost(curr);
							curr.setPre(n);
							++size;
						}
				public void addToTail(T newdata)
						{
							Node<T> n=new Node<T>(newdata,null,null);
							Node<T> prev=tailer.getPre();
							n.setPost(tailer);
							tailer.setPre(n);
							n.setPre(prev);
							prev.setPost(n);
							++size;
						}
				public int size(){return size;}		
				
				public Node<T> getHead(){ if(isEmpty()) throw new IllegalArgumentException("List is Empty!!!!!");return header.getPost();}
				public Node<T> getTail(){if(isEmpty()) throw new IllegalArgumentException("List is Empty!!!");return tailer.getPre();}
				
				public boolean isEmpty(){return (size==0);}
				
				public Node<T> getNext(Node<T> key){ if(key==null) throw new IllegalArgumentException(); return key.getPost();}
				public Node<T> getPrevious(Node<T> key){ if(key==null) throw new IllegalArgumentException(); return key.getPre();}
				
				public boolean hasNext(Node<T> strt){return (strt!=tailer);}
				public boolean hasPrevious(Node<T> end){return (end!=header);}
				
				public int indexOf(T key)
					{
						
						int index=-1;
						boolean flag=false;
						Node<T> strt=getHead();
							while(hasNext(strt))
								{
									++index;
									if(strt.getData()==key)
										{ flag=true;break;}	
										strt=getNext(strt);
								}
							if(flag)
								return index;
							else
								return -1;
					
					}
				
				public void delete(Node<T> key)
					{
						if(key==header || key==tailer)
						throw new UnsupportedOperationException();
						Node<T> prev=key.getPre();
						Node<T> curr=key.getPost();
						curr.setPre(prev);
						prev.setPost(curr);
						--size;
					
					}
				public void delete(T key)
					{
						Node<T> strt=getHead();
							boolean flag=false;
							while(hasNext(strt))
								{
									if(strt.getData()==key)
									{ flag=true;break;}
									strt=getNext(strt);
								
								}
						if(flag)
						{
						Node<T> prev=strt.getPre();
						Node<T> curr=strt.getPost();
						curr.setPre(prev);
						prev.setPost(curr);
						--size;
						}
						else 
						throw new IllegalArgumentException("Can't Delete");
					
					}
				public String toString()	
					{
						Node<T> key=getHead();
						String s="[";
							while(hasNext(key))
								{
									s+=key.getData();
									s+=",";
									key=getNext(key);
								}
							s+="]";
								return s;
					
					}
		
		}
		
		public class GLLDemo      
			{
				public static void main(String []args)
					{
						GLinkedList<Integer> list=new GLinkedList<Integer>();
							for(int i=0;i<10;++i)
								list.addToHead(i+1);
								System.out.println("Size= "+list.size());
								System.out.println(list.toString());
								list.addToTail(11);
								System.out.println("Size= "+list.size());
								System.out.println(list.toString());
								list.delete(list.getHead());
								System.out.println("Size= "+list.size());
								System.out.println(list.toString());
								System.out.println("Index="+list.indexOf(5));
								try{list.delete(12);}
								catch(Exception e){System.out.println(e);}
								System.out.println("Size= "+list.size());
								System.out.println(list.toString());
					}
			}