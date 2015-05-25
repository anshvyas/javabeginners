		/*******************************************************************************************
		
			Buffered Input Stream on a data demonstrating use of mark and reset
		
		*********************************************************************************************/
		
		import java.io.*;
		
		class BufferedInputDemo
			{
				public static void main(String []args) throws IOException
					{
						String ip="This is a &copy; copyright symbol ;" + "but this is &copy not.\n";
						byte buff[]=ip.getBytes();
						BufferedInputStream in=new BufferedInputStream(new ByteArrayInputStream(buff));
						int c;
						boolean marked=false;
						while((c=in.read())!=-1)
							{
								switch(c)
									{
										case '&':
										if(!marked)
											{
												in.mark(32);
												marked=true;
											}
										else 
											marked=false;
										break;
											
										case ';':
											if(marked)
												{
													System.out.print("(c)");
													marked=false;
												}
											else	
												System.out.print((char)c);
										break;

											case ' ':
												if(marked)
													{
														in.reset();
														marked=false;
														System.out.print("&");
													}
												else
													{
														System.out.print((char)c);
													}
											break;
											
											default:
												if(!marked)
											System.out.print((char)c);
												break;
									}
							
							}
						in.close();	
					
					}
			
			
			}