  /*********************************************************
  
				File Input Operations
  
  **********************************************************/
  import java.io.*;
  
  class FileInputDemo
		{
			public static void main(String []args) throws IOException
				{
					FileInputStream f=new FileInputStream("C:\\Users\\Anshul\\Desktop\\java\\input.txt");
					int size=f.available();
						System.out.println(" Total Size of File= "+size);
						int n=size/20;
						System.out.println("Reading first "+n+" bytes of the file");
						for(int i=1;i<=n;++i)
							System.out.print((char)f.read());
						System.out.println("\nAre more bytes available:?? "+f.available());
						byte b[]=new byte[n];
							System.out.println("NO. of bytes read form the byte array: "+f.read(b));
							System.out.println(new String(b,0,n));
							
							System.out.println("Are more bytes available:?? "+(size=f.available()));
							System.out.println("Skipping half of bytes");
							f.skip(size/2);
							System.out.println("Still available: "+f.available());
							if(f.read(b,n/2,n/2)!=(n/2))
							System.err.println("Can't read"+n/2+"bytes");
								/*for(byte bs:b)
									{
										char ch=(char)bs;
										System.out.println(ch+"->");
									}*/
							System.out.println(new String(b,0,b.length));
							
							
				
				}
		
		
		
		}