	/**
		Evaluation of an expression using Two Stack algorithm(DijKarta's)
	*/
	import java.util.Stack;
	import java.util.Scanner;
	class TwoStack
		{	
			void result(String str)
				{
			Stack<String> ops=new Stack<String>();
			Stack<Double> vals=new Stack<Double>();
				Scanner sc=new Scanner(str);
					while (sc.hasNext())
						{	String val=sc.next();
								if(val.equals("("));
								else if(val.equals("+")) ops.push(val);
								else if(val.equals("-")) ops.push(val);
								else if(val.equals("*")) ops.push(val);
								else if(val.equals("/")) ops.push(val);
								else if(val.equals(")"))
									{
										String oper=ops.pop();
										Double v=vals.pop();
											if(oper.equals("+")) v+=vals.pop();
											if(oper.equals("-")) v-=vals.pop();
											if(oper.equals("*")) v*=vals.pop();
											if(oper.equals("/")) v/=vals.pop();
											vals.push(v);
									}
								else vals.push(Double.parseDouble(val));	
						}
					System.out.println("Result= "+vals.pop());	
				}
		
		}
		
		class Evaluate
			{
				public static void main(String []args)
					{
						TwoStack stck=new TwoStack();
						stck.result("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) ");
						stck.result("( 1 + ( ( 2 3 + ) * ( 4 5 * ) ) ) ");
						stck.result(" 1 + ( 2 3 + ) * ( 4 5 * ) ");
					}
			
			
			}