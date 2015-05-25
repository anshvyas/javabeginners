		/************************************************************
				
				Simple Word Counter using I/O
			
		**************************************************************/
		import java.io.*;
		
		class WordCounter
			{
				static int charct=0;
				static int linect=0;
				static int wordct=0;
				
				
				public static void wc(InputStreamReader rdr) throws IOException
					{
						int c=0;
						boolean lastWhite=true; 
						String pattern="\t\r\n ";
						while((c=rdr.read())!=-1)
							{
								charct++;
								if(c=='\n')
								++linect;
								int index=pattern.indexOf(c);
									if(index==-1)
										{
											if(lastWhite) wordct++;//detecting start of a word
											lastWhite=false;//making it false untill we get a new white space
										
										}
										else
										lastWhite=true;
							}
							if(charct!=0)linect++; //for a single long continous line								
					
					}
					
					public static void main(String []args) throws IOException
						{
							if(args.length==0)
							wc(new InputStreamReader(System.in));
							else
								{
							FileReader fr=new FileReader("C:\\Users\\Anshul\\Desktop\\java\\Exp.txt");
								wc(fr);
								}
						System.out.println("Character="+charct+"Words="+wordct+"Lines="+linect);
						}
					
					
			
			
			}