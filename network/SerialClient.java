				/****************************************************
				
							Object Serialization Client
				
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
					
					class SerialClient
						{
							public static void main(String []args) throws IOException,ClassNotFoundException
								{
									Socket clnt=new Socket("127.0.0.1",6060);
									ObjectOutputStream out=new ObjectOutputStream(clnt.getOutputStream());
									ObjectInputStream in=new ObjectInputStream(clnt.getInputStream());
									out.writeObject(new testObject(1,"Hello"));
									out.flush();
									in.close();
									out.close();
									clnt.close();
								
								}
						
						
						
						}