
	package pck1;
	class Subclass1
		{
			 Subclass1()
				{
					Cls c=new Cls();
					System.out.println("Inside the same package: ");
					System.out.println("Default access: "+c.def);
					System.out.println("Private int not accessible here!!!");
					System.out.println("Public int: "+c.pub);
					System.out.println("Protected int: "+c.pro);
				
				}
		}