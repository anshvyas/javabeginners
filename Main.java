/* package whatever; // don't place package name! */

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws IOException
	{
		 int max=40000;
		 int MAX=1000000000;
		Scanner s=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
			{
			 
				int m=in.nextInt();
				int n=in.nextInt();
				boolean prime[]=new boolean[max+1];
				prime[0]=false;
				prime[1]=false;
				prime[2]=true;
				int i,j,k;
				for(i=3;i<=max;++i)
				{
					if(i%2==0)prime[i]=false;
					else prime[i]=true; 
				}
				for(j=3;j<=Math.sqrt(MAX);++j)
					{
						for( k=j;k*j<=max;++k)
						prime[k*j]=false;
						
					}
					for(int l=m;l<=n;++l)
						if(prime[l])
						System.out.println(l);
						System.out.println();
						
			}
			s.close();
			in.close();
	}
}




