	
	package pck1;
	public class Cls
		{
			int def=1;
			private int pri=2;
			public int pub=3;
			protected int pro=4;
			
			public Cls()
			{
				System.out.println("In the same Class: ");
				System.out.println("Default access: "+def);
				System.out.println("Private int: "+pri);
				System.out.println("Public int: "+pub);
				System.out.println("Protected int: "+pro);
			}
		
		}