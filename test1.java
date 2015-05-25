/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test1
{
	public static void main (String[] args) throws IOException
	{
		Scanner rdr=new Scanner(System.in);
			int mush[]=new int[10];
			int curr,sum=0,min=0,max=0;
			for(int i=0;i<10;++i)
				mush[i]=rdr.nextInt();
			for(int j=0;j<10;++j)
				{
					sum+=mush[j];
					if(sum>100)
					{
							max=sum;
							min=sum-mush[j];
							 max = max - 100;
            				 min = 100 - min;
							
							if((min)<(max))
							System.out.println(100-min);
							else
							System.out.println(100+max);
							break;
					}
				else if((sum<100) && (j==mush.length-1))
					{
						System.out.println(sum);
					}
				else if(sum==100)
					{
						System.out.println(sum);
						break;
					}
				}
	}
}