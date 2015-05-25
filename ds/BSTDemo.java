					/************************************************************************
											Binary Search Tree Demo
					
					************************************************************************/
					
			class BSTree
				{
				
					private class BSTNode
						{
							private BSTNode left,right;
							private int data;
							
							public BSTNode(){this.left=this.right=null;this.data=0;}
							public BSTNode(int data){this.left=this.right=null;this.data=data;}
							public int getData(){return this.data;}
							public void setData(int data){this.data=data;}
							public BSTNode getLeft(){return this.left;}
							public BSTNode getRight(){return this.right;}
							public void setLeft(BSTNode left){this.left=left;}
							public void setRight(BSTNode right){this.right=right;}
							
						}
					protected BSTNode root,left,right;
						public BSTree(){root=null;}
						public boolean isEmpty(){return this.root==null;}
						public void insert(int n)
						{
							BSTNode prev=null;
							BSTNode curr=root;
								while(curr!=null)
									{
										prev=curr;
										if(curr.getData()>=n)
										curr=curr.getLeft();
										else 
										curr=curr.getRight();
									}
								if(curr==null)root=new BSTNode(n);
									else if(prev.getData()>=n) prev.left=new BSTNode(n);
									else prev.right=new BSTNode(n);
						}
						public void inorder(){ inorder(root);}
						private void inorder(BSTNode node){ if(node!=null){ inorder(node.getLeft());System.out.print(node.getData()+" "); inorder(node.getRight());}  }
				}
				
				
				class BSTDemo
					{
						public static void main(String []args)
							{
								BSTree tr=new BSTree();
								System.out.println("Is Empty??"+tr.isEmpty());
									tr.insert(8);
									tr.inorder();
									tr.insert(5);
									tr.inorder();
									tr.insert(13);
									tr.inorder();
									tr.insert(7);
									tr.inorder();
									tr.insert(4);
									tr.inorder();
									tr.insert(14);
									tr.inorder();
									tr.insert(12);
									tr.inorder();
									System.out.println("Is Empty???"+tr.isEmpty());
							}
					}