	import java.util.*;
		
		class HashTable
			{
				private  Object [] table;
				private int tablesize=10;
				private int element_count;
					HashTable()
						{
							table=new Object[this.tablesize];
								for(int i=0;i<tablesize;++i)
								table[i]=new LinkedList<Object>();
							element_count=0;
						}
						HashTable(Object key,Object data)
							{
								this();
								this.add(key,data);
							}
						public void add(Object key,Object data)	
							{
								if(data==null || key==null)
								throw new UnsupportedOperationException("Can't add !!!!!! ");
								
								int pos=this.hash(key);	
								HashNode node=new HashNode(key,data);
								((LinkedList)this.table[pos]).add(node);
								System.out.println(pos+" "+((LinkedList)this.table[pos]).add(node)+" "+((LinkedList)this.table[pos]).indexOf(node)+" "+node.getKey()+" "+node.getData());
								element_count++;
							}
						private int hash(Object key)
							{
								int base=0;
								String str=key.toString().toLowerCase();
									for(int i=0;i<str.length();++i)
										{
											base+=str.charAt(i);
										}
									//System.out.println(base%tablesize);	
									return (base%tablesize);	
							}
							
						public void remove(Object key)
							{
								int hash=this.hash(key);
							System.out.println(hash);
								if(this.table[hash]!=null)
									{
										HashNode node=new HashNode();
										node.setKey(key);
										ListIterator itr=((LinkedList)this.table[hash]).listIterator();
											while(!(itr.next()==node));
													itr.remove();
													element_count--;
									}
								
							}
						public int size(){return element_count;}	
						
				private class HashNode
					{
						Object key;
						Object data;
						HashNode()
						{
							this.key=null;
							this.data=null;
						}
						HashNode(Object newkey,Object newdata)
						{
							this.data=newdata;
							this.key=newkey;
						}
						public void setKey(Object key){ this.key=key;}
						public void setData(Object data){this.data=data;}
						public Object getKey(){return this.key;}
						public Object getData(){return this.data;}
						public String toString(){ return "key: ["+this.key+"]"+" data: ["+this.data+"] " ;}
					}
			
			
			}
			
		class HashDemo
			{
				public static void main(String []args)
					{
						HashTable tlb=new HashTable();
						tlb.add("dog",0);
						tlb.add("cat",0);
						tlb.add("lion",1);
						tlb.add("turtle",1);
						System.out.println("Size= "+tlb.size());
						tlb.remove("cat");
						System.out.println("Size= "+tlb.size());
					}
			
			}