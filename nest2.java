	//Shadowing of x
	class outShadow
		{
			int x=10;
			class inShadow
				{
					int x=20;
					void print_X(int x)
						{
					System.out.println("x= "+x);
					System.out.println("IN_X= "+this.x);
					System.out.println("OUT_X= "+outShadow.this.x);
						}
				}
		}
	class nest2
		{
			public static void main(String []args)
				{
			outShadow out=new outShadow();
			outShadow.inShadow in= out.new inShadow();
			in.print_X(25);
				}
		}