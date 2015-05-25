	
	package Mypck;
	class Bank
		{
			static int bal=0;
			Bank(int Bal)
				{
					bal+=Bal;
					System.out.println("Your Current Balance is: "+bal);
				}
		}	
		
	class Account
		{
			public static void main(String []args)
				{
					Bank acc1=new Bank(500);
					 acc1=new Bank(600);
				}
		
		}
		
		