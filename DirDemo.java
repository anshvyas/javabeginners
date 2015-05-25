	/****************************************
	
	 Use of Directory in File I/O
	
	******************************************/
	
	import java.io.*;
	
	
	class DirDemo
		{
				
		public static void main(String []args)
			{
			
			String dirname="G:/new site/zBizz";
				File dir=new File(dirname);
				File htmlfiles;
				if(dir.isDirectory())
					{
						System.out.println("Directory: "+dirname);
						String []list=dir.list();
					
				for(int i=0;i<list.length;++i)
					{
						File f1=new File(dirname+"/"+list[i]);
						htmlfiles=f1;
						if(f1.isDirectory())
							{
								System.out.println(list[i]+" is a directory"+" It contains following:");
									String []list1=f1.list();
									for(int j=0;j<list1.length;++j)
									System.out.println(list1[j]);
									
							}
							
							else
							{
								System.out.println(list[i]+" is a File");
								
							}
							
				
					}
			}
			else 
			System.out.println(dirname+" is not a directory");
							
			
			}
			
		
		
		}