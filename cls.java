	class dim
	{
		double l;
		double b;
		double h;
		dim(double L,double B,double H)
		{
			l=L;
			b=B;
			h=H;
		}
	}
	
	class vol
	{
		public static void main(String []args)
			{

		dim obj1=new dim(5,5,5);
		System.out.println(" l= "+obj1.l+" b= "+obj1.b+" h="+obj1.h);
		obj1.l=10.0;
		obj1.b=20.0;
		obj1.h=30.0;
		dim obj2=new dim(10,10,10);
		System.out.println(" l= "+obj2.l+" b= "+obj2.b+" h="+obj2.h);
		obj2.l=40.0;
		obj2.b=50.0;
		obj2.h=60.0;
		System.out.println(args);
		System.out.println("Volume for obj1 is"+(obj1.l*obj1.b*obj1.h));
		System.out.println("Volume for obj2 is"+(obj2.l*obj2.b*obj2.h));
			}
	
	}