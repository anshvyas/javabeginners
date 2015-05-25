
	package pck1;
	class Subclass extends pck1.Cls
		{
			public Subclass()
				{
					System.out.println("Inside Subclass:");
					System.out.println("Default access: "+def);
					System.out.println("Private int not accessible here!!!");
					System.out.println("Public int: "+pub);
					System.out.println("Protected int: "+pro);
				}
		
		}