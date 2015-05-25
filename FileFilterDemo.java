	/**********************************************

			Creating a Simple File Filter

	*************************************************/
	import java.io.*;
	
	
	class OnlyExt implements FilenameFilter
		{
			String ext;
			OnlyExt(String ext)
				{
					this.ext="."+ext;
				}
			public boolean accept(File dir,String name)
				{
					return name.endsWith(ext);
				}
		
		}
		
		class FileFilterDemo
			{
				public static void main(String []args) throws IOException
					{
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
						String str[]=br.readLine().split(" ");
						String path=str[0];
						String ext=str[1];
						File dir=new File("G:/new site/zBizz/"+path);
						String allfiles[];
						if(dir.isDirectory())
							{
							
								OnlyExt only=new OnlyExt(ext);
							 allfiles=dir.list(only);
								for(int i=0;i<allfiles.length;++i)
								System.out.println( allfiles[i]);
								
							
							}
						else System.out.println("No files Found");	
					
					
					
					}
			
			
			
			}