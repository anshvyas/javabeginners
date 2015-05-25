	/****************************************************
	
		PostFix Expression Evaluation
	
	****************************************************/
	
	
	import java.util.Scanner;
	import java.util.Stack;

	class PostFixExp
		{
			void postCalc( String str)
				{
					Scanner sc=new Scanner(str);
					Stack<Double> vals=new Stack<Double>();
						while(sc.hasNext())
							{
								String exp=sc.next();
								if(exp.equals("+")) vals.push(vals.pop()+vals.pop());
								else if(exp.equals("-")) vals.push(vals.pop()-vals.pop());
								else if(exp.equals("*")) vals.push(vals.pop() * vals.pop());
								else if(exp.equals("/")) vals.push(vals.pop() / vals.pop());
								else vals.push(Double.parseDouble(exp));
							}
					System.out.println(vals.pop());
				}
		}
		
		class PostFix
			{
				public static void main(String []args)
					{
						String str=" 3 4 5 + *";
						String str1="1 2 3 4 5 * + 6 * * +";
						String str2="7 16 16 16 * * * 5 16 16 * * 3 16 * 1 + + +";
						PostFixExp obj=new PostFixExp();
						obj.postCalc(str);
						obj.postCalc(str1);
						obj.postCalc(str2);
					}
			
			}
		
		