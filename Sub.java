	package pck2;
		class Sub
			{
				Sub()
				{
				 pck1.Cls obj=new pck1.Cls();
					System.out.println("Inside Different class and package: ");
					System.out.println("Default access not provided!!!");
					System.out.println("Private access not provided!!!!!");
					System.out.println("Public int: "+obj.pub);
					System.out.println("Protected access not provided!!!");
				}
			
			}