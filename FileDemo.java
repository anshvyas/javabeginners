	/***********************************************************
	
		Basic File I/O
	
	************************************************************/
	
	import java.io.*;
	
	class FileDemo
		{
		
		static void fileInfo()
			{
					File file=new File("C:/Users/Anshul/Desktop/java/Copyright.txt");
					System.out.println("Name:"+file.getName());
					System.out.println("Path:"+file.getPath());
					System.out.println("Absolute Path:"+file.getAbsolutePath());
					System.out.println("Parent:"+file.getParent());
					System.out.println(file.exists()?"exists":"Doesn't Exists");
					System.out.println(file.canRead()?"Readable":"Can't be read");
					System.out.println(file.canWrite()?"is Writable":"Can't be wriiten");
					System.out.println(file.isDirectory()?"is a Directory":"isn't a Directory");
					System.out.println(file.isAbsolute()?"Has an Absolute Path":"Doesn't have an Absolute Path");
					System.out.println("File last modified:"+file.lastModified());
					System.out.println("File size:"+file.length()+"bytes");
			
			}
			public static void main(String []agrs)
				{
					
				FileDemo.fileInfo();
				
				}
		
		
		
		}