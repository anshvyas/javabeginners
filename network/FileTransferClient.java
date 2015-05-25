						/*******************************************************
						
								File Transfer Client :Single Client
						
						********************************************************/
						
						
					import java.io.*;
					import java.net.*;	
					
					class FileTransferClient
						{
						
							public static void main(String args[]) throws IOException
								{
									Socket clientsocket=new Socket("127.0.0.1",6060);
									byte b[]=new byte[1024];
									BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Anshul\\Desktop\\java\\network\\input.txt"));
									DataInputStream in=new DataInputStream(clientsocket.getInputStream());
									int bytesread=in.read(b,0,b.length);
									out.write(b,0,bytesread);
									out.flush();
									out.close();
									in.close();
									clientsocket.close();
								
								}
						
						
						}