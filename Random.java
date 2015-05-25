	import java.util.Random;
	class Rand_Exp
		{
		
			public static void main(String []args)
				{
						int exp1,exp2;
					Random rand=new Random();
				for(int i=0;i<32000;++i)
					{
					exp1=rand.nextInt();
					exp2=rand.nextInt();
					try
						{
						 int res=exp2/exp1;
						 System.out.println(res);
						}
					catch(ArithmeticException exp)
						{
						System.out.println("Exception"+exp);
						break;
						}
					}
				}
		
		}