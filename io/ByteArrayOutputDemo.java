		/*********************************************************
		
			Output using ByteArrayOutputSteam
		
		**********************************************************/
		
		import java.io.*;
		
		class ByteArrayOutputDemo
			{
			
				public static void main(String []args) throws IOException
					{
						String input="This is a sample input string";
						byte buff[]=input.getBytes();
						ByteArrayOutputStream out=new ByteArrayOutputStream();
						out.write(buff);
						System.out.println("Data Wriiten in Buffer: "+out.toString());
						out.flush();
						System.out.println("Data wriiten as an array: char by char");
						for(byte b:buff)
						System.out.println(((char) b));
						System.out.println("Into a output stream");
						FileOutputStream f=new FileOutputStream("C:\\Users\\Anshul\\Desktop\\java\\out.txt");
						out.writeTo(f);
						f.close();
						System.out.println("Doing a reset");
						out.reset();
						for(int i=0;i<5;++i)
						out.write((int)'X');
						System.out.println(out.toString());
						out.close();
					}
			
			
			
			}