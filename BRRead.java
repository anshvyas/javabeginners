 import java.io.*;
	class BRRead
		{
			public static void main(String []args)
				throws IOException
				{
					char c;
					BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
					
					System.out.println("Enter characters, 'Enter' to quit");
					do
						{
							c=(char)reader.read();
							System.out.println(c);
						} while(c!='\r');
				
				}
		
		
		}