							/****************************************
							
										Creating a  Simple Client 
							
							******************************************/
							
				import java.net.*;
				import java.io.*;

					class Client
						{
							public static void main(String []args) throws IOException
								{
									Socket client=new Socket("127.0.0.1",6066);
									System.out.println("Just connected to "
									+ client.getRemoteSocketAddress());
									DataInputStream in=new DataInputStream(client.getInputStream());
									DataOutputStream out=new DataOutputStream(client.getOutputStream());
									System.out.println(in.readUTF());
									out.writeUTF("Hello accepted");
									in.close();
									client.close();
								}
						
						}