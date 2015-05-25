/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Id
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					String s;
			while((s=br.readLine())!=null)
				{
					int count=0;
					char str[]=s.toCharArray();
						for(int j=0;j<str.length-1;++j)
							{
								if((Character.isUpperCase(str[j]))&&(Character.isUpperCase(str[j+1]))||(Character.isLowerCase(str[j]))&&(Character.isLowerCase(str[j+1])))
									count++;
							}		
							System.out.println(count);
				}
		
	}
}