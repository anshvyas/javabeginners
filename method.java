	class exp
			{
				int l,b,h;
				exp(){l=b=h=-1;}
				exp(int L,int B,int H){l=L;b=B;h=H;}
				exp (exp E){l=E.l;b=E.b;h=E.h;}
				boolean comp(exp Test)
				{ if((Test.l==l)&&(Test.b==b)&&(Test.h==h)) return true;
									else return false;
				}
				long volume(){return l*b*h;}
			}
	class method
			{
				public static void main(String []args)
					{
						exp B1=new exp();
						exp B2=new exp(55,50,45);
						exp B3=new exp(B2);
						exp T1=new exp(100,100,100);
						exp T2=new exp();
						exp T3=new exp(100,100,100);
						System.out.println("For T1 and T2 "+T1.comp(T2));
						System.out.println("For T1 and T3 "+T1.comp(T3));
						System.out.println();
						System.out.println("Vol for B1="+B1.volume());
						System.out.println("Vol for B2="+B2.volume());
						System.out.println("Vol for B3="+B3.volume());
					}
			
			
			
			}