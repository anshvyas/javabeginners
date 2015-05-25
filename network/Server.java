			/****************************************
			
					Creating a simple server
			
			******************************************/
			
			import java.net.*;
			import java.io.*;
			
			
				
			class Server
				{
					public static void main(String []args) throws IOException
						{
							ServerSocket serversocket=new ServerSocket(6066);
							
							while(true)
								{
								System.out.println("Waiting for client on port " +
								serversocket.getLocalPort() + "...");
									Socket s=serversocket.accept();
									System.out.println("Just connected to "
									+ s.getRemoteSocketAddress());
									System.out.println("Server Established");
									DataOutputStream out=new DataOutputStream(s.getOutputStream());
									DataInputStream in=new DataInputStream(s.getInputStream());
									out.writeUTF("Hello net");
									System.out.println(in.readUTF());
									out.close();
									s.close();
								}
						}
				
				
				}