
	package myds
	;
	public class DLinkList
		{
			 class Node	
				{
					int data;
					Node pre,post;
					Node(int newdata,Node newpre,Node newpost)
						{
							setData(newdata);
							pre=newpre;
							post=newpost;
						}
					
						public void setData(int new_val){this.data=new_val;}
						public void setPre(Node new_pre){this.pre=new_pre;}
						public void setPost(Node new_post){this.post=new_post;}
						
						public int getData(){return data;}
						public Node getPre(){return pre;}
						public Node getPost(){return post;}
				}
			protected Node header,tailer;
			protected int size;
			DLinkList()
			{
				header=new Node(0,null,null);
				tailer=new Node(0,header,null);
				header.setPost(tailer);
				size=0;
			}
			public int size(){return size;}
			public boolean isEmpty(){return (size==0);}
			public Node getFirstNode()
			{
				if(isEmpty()) throw new IllegalStateException("List is Empty");
				return header.getPost();
			}
			public Node getLastNode()
			{
				if(isEmpty()) throw new IllegalStateException("List is Empty");
				return tailer.getPre();
			
			}
		public void addAfter(Node key,Node newNode)
			{
				if(key==tailer) throw new IllegalArgumentException("!!!!!!!");
				Node curr=key.getPost();
				newNode.setPre(key);
				key.setPost(newNode);
				newNode.setPost(curr);
				curr.setPre(newNode);
				size++;
			}
		public void addBefore(Node key,Node newNode)
			{
				if(key==header) throw new IllegalArgumentException("!!!!!!!!");
				Node prev=key.getPre();
				newNode.setPost(key);
				key.setPre(newNode);
				newNode.setPre(prev);
				prev.setPost(newNode);
				size++;
			}
		public Node getNext(Node key)
			{
				if(!HasNext(key)) throw new IllegalArgumentException("Can't traverse beyond tailer");
				return key.getPost();
			}
			
		public Node getPrevious(Node key)
			{
				if(!HasPrevious(key)) throw new IllegalArgumentException("Can't traverse beyond header");
				return key.getPre();
			}
		public boolean HasNext(Node strt){return (strt!=tailer); }
		public boolean HasPrevious(Node end){return (end!=header);}	
		public void addToStart(Node key)
			{
				addAfter(header,key);
			}
		public void addToLast(Node key)
			{	
				addBefore(tailer,key);
			}
		public void delete(Node del)
			{
				if(del==header || del==tailer|| del==null) throw new IllegalArgumentException("Cannot Delete");
				Node prev=del.getPre();
				Node next=del.getPost();
				prev.setPost(next);
				next.setPre(prev);
				--size;
			
			}
		public String toString()
			{
				String s="[";
				Node strt=getNext(header);
					while(strt!=tailer)
						{
						s+=strt.getData();
						strt=getNext(strt);
						if(strt!=tailer)
						s=s+",";
						
						}
					s+="]";
					return s;
			}
		}