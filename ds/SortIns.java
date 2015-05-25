//Insertion Sort
	class Sort
		{
			private int arr[]={5,9,1,7,10,2,4};
				void sort()
					{
					for(int i=1;i<arr.length;++i)
						{
							int j=i-1;
							int temp=arr[i];
							while((j>=0)&&(temp<arr[j]))
								{
									int c=arr[j];
									arr[j+1]=c;
									arr[j]=temp;
									--j;
								}
							show();
							System.out.println();	
						}
					
					
					}
				private void show()
						{for(int i=0;i<arr.length;++i)System.out.print(" "+arr[i]);
						}	
		}
		
		class SortIns
			{
			public static void main(String []args)
				{
			 Sort sc=new Sort();
			sc.sort();
				}
			}