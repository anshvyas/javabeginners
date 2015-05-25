			/*****************************************************************
			
				File Transfer Server:Single Client
			
			*******************************************************************/
			
				import java.io.*;
				import java.net.*;
				
				class FileTransferServer
					{
					
						public static void main(String []agrs) throws IOException
							{
						ServerSocket serversocket=new ServerSocket(6060);
						File myfile=new File("C:\\Users\\Anshul\\Desktop\\java\\input.txt");
							while(true)
								{
									try
										{
											Socket s=serversocket.accept();
											byte []b=new byte[(int)myfile.length()];
											BufferedInputStream in=new BufferedInputStream(new FileInputStream(myfile));
											in.read(b,0,b.length);
											DataOutputStream out=new DataOutputStream(s.getOutputStream());
											out.write(b,0,b.length);
											out.flush();
											in.close();
											out.close();
											s.close();
										}
										catch(IOException e){e.printStackTrace();}
								}
						
						
							}
					
					
					
					}