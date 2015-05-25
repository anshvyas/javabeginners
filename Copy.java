 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
	
	class Copy
		{
			public static void main(String []args)
			
					throws IOException
				{
					FileInputStream in=null;
					FileOutputStream out=null;
					try
						{
							in= new FileInputStream("Exp.txt");
							out=new FileOutputStream("Out.txt");
							int ch;
							while((ch=in.read())!=-1)
							out.write(ch);
						}
					finally
						{
							if(in==null)
								in.close();
							if(out==null)
								out.close();
						
						}
				
				}
		
		
		}