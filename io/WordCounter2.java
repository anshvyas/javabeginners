/**************************************************************************

				Word Counter Using Stream Tokenizers

****************************************************************************/

import java.io.*;

	class WordCounter2
	{
		static  int wordct=0;
		static int charct=0;
		static int linect=0;
		public static void wc(InputStreamReader rdr) throws IOException
			{
				StreamTokenizer token=new StreamTokenizer(rdr);
				token.resetSyntax();
				token.whitespaceChars(0,' ');
				token.wordChars(33,255);
				token.eolIsSignificant(true);
				while(token.nextToken()!=token.TT_EOF)
					{
						switch(token.ttype)
							{
						
						case StreamTokenizer.TT_EOL:
						linect++;
						charct++;
						break;
						case StreamTokenizer.TT_WORD:
						wordct++;
						default:
						charct+=token.sval.length();
						break;
							}
					
					}
					if(charct!=0) linect++;
					
					
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