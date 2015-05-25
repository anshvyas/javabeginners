				/****************************************************
				
							Object Serialization Server
				
				*****************************************************/
				
				import java.io.ObjectOutputStream;
				import java.io.ObjectInputStream;
				import java.io.IOException;
				import java.io.Serializable;
				import java.net.ServerSocket;
				import java.net.Socket;
				
				class testObject implements Serializable
					{
						private static final long serialVersionUID=1L;
						private int i;
						private String str;
						testObject(int i,String str)
							{
								this.i=i;
								this.str=str;
							}
							public String toString()
							{
								String str=" ";
								return(str+this.i+" "+this.str);
							}	
								
					}
					
					class SerialServer
						{
							public static void  main(String []args) throws IOException,ClassNotFoundException
								{
									ServerSocket serv=new ServerSocket(6060);
									testObject obj;
										while(true)
											{
												Socket s=serv.accept();
												ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
												ObjectInputStream in=new ObjectInputStream(s.getInputStream());
												while((obj=(testObject)in.readObject())!=null)
													{
														System.out.println(obj.toString());
														System.out.flush();
													}
													in.close();
													out.close();
													s.close();
											}
								
								}
						
						
						}
				