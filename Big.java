/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Big
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int B,G;
		Scanner sc=new Scanner(System.in);
		while(true)
			{
				G=sc.nextInt();
				B=sc.nextInt();
				if(B==-1 && G==-1)break;
				if((B==0 && G==0)||(B==1 && G==1))System.out.println(0);
				else if(B==0 && G!=0)System.out.println(G);
				else if(G==0 && B!=0)System.out.println(B);
					if(B>=2 && G>=2)
						{
						if(B%2!=0 && G%2!=0){B+=1;G+=1;}
						else if (B%2!=0) {B+=1;}
						else if(G%2!=0) {G+=1;}
						
						if(B<=G){System.out.println(B/G);}
						else if(G<=B){System.out.println(B/G);}
						}
			}
	}
}