/*************************************************************

		File OutPut Operations 

**************************************************************/

   import java.io.*;
   
   class FileOutputDemo
	{
		public static void main(String []agrs) throws IOException
				{
					String input="This is a sample input string";
					byte buff[]=input.getBytes();
					FileOutputStream f1=new FileOutputStream("C:\\Users\\Anshul\\Desktop\\java\\input.txt",true);
					for(int i=0;i<buff.length;++i)
							{
								f1.write(buff[i]);
							}
					f1.close();
						FileOutputStream f2=new FileOutputStream("C:\\Users\\Anshul\\Desktop\\java\\op1.txt");
						f2.write(buff);
						f2.close();
							FileOutputStream f3=new FileOutputStream("C:\\Users\\Anshul\\Desktop\\java\\op2.txt",true);
							f3.write(buff,buff.length/4,buff.length/2);
							f3.close();
				
				}
	
	
	}