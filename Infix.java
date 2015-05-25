	/**************************************************************
	
			Infix To PostFix Conversion
	
	***************************************************************/
	
	import java.util.Scanner;
	import java.util.Stack;
	class InFixExp
		{
			void inToPost( String str)
				{
			Stack<String> ops=new Stack<String>();
			Scanner sc=new Scanner(str);
				while(sc.hasNext())
					{
						String exp=sc.next();
						if(exp.equals("(")) System.out.print("");
						else if(exp.equals("+")) ops.push(exp);
						else if(exp.equals("-")) ops.push(exp);
						else if(exp.equals("*")) ops.push(exp);
						else if(exp.equals("/")) ops.push(exp);
						else if(exp.equals(")")) System.out.print(ops.pop()+" ");
						else System.out.print(exp+" ");
					}
				System.out.println();	
				}
		
		
		}
		
	class InFix	
		{
			public static void main(String []args)
				{
					InFixExp obj=new InFixExp();
					String str="( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )";
					String str2="( 2 + ( ( ( 3 + 4 ) * ( 5 * 6 ) ) / ( 4 - 2 ) ) + 8 )";
					obj.inToPost(str);
					obj.inToPost(str2);
				}
		
		}