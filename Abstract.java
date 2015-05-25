	abstract class Sup
	{
		abstract void call()
				;
		void show()
		{
			System.out.println("call in sup");
		}
	}
	
	class Sub extends Sup
		{
			void call()
			{System.out.println("call in sub");}
		
		}
	class Abstract
		{
			public static void main(String []args)
				{
					Sub s=new Sub();
					System.out.println("Call by Inherited class: ");
					s.call();
					s.show();
					Sup p=s;
					System.out.println("Call by Abstract Class reference: ");
					p.call();
					p.show();
				}
		
		}