/************************************************************
	    File Input Using ByteArray Buffers
*************************************************************/
import java.io.*;
		class ByteArrayInputDemo
			{
			
			public static void main(String []args) throws IOException
			{
				String input="abc";
				byte buff[]=input.getBytes();
				int c;
				ByteArrayInputStream in=new ByteArrayInputStream(buff);
				for(int i=0;i<2;++i)
					{	while((c=in.read())!=-1)
						{
						if(i==0)
							{
									System.out.print((char)c);	
							}
							else
							{
								System.out.print(Character.toUpperCase((char)c));
							}
						}	
					in.reset();
					}
			in.close();
			}
			}