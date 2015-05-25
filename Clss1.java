	
	package pck2;
	class Clss1 extends pck1.Cls
		{
			Clss1()
				{
					System.out.println("Inside Different package but a subclass: ");
					System.out.println("Default access not provided!!!!");
					System.out.println("Private acess not provided!!!");
					System.out.println("Public int: "+pub);
					System.out.println("Protected int: "+pro);
				}
		
		}