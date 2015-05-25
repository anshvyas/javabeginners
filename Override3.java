		class Area
			{
				double d1,d2;
				Area(double a,double b)
					{
						d1=a;
						d2=b;
					}
				double area()
				{
					System.out.println("Area Undefined!!!!");
					return 0;
				}
			}
			
		class Rectangle extends Area
			{
				Rectangle(double a,double b)
					{
						super(a,b);
					}
			
				double area()
				{
					System.out.println("Area of rectangle: ");
					return d1*d2;
				}
			}
			
		class Triangle extends Area
			{
				Triangle(double a,double b)
				{
					super(a,b);
				}
				double area()
				{
					System.out.println("Area of Triangle: ");
					return (d1*d2)/2;
				}
			}
			
		class Override3
			{
				public static void main(String []args)
					{
						Area a;
						Rectangle r=new Rectangle(10,20);
						Triangle t=new Triangle(25,15);
						a=r;
						System.out.println(a.area());
						a=t;
						System.out.println(a.area());
					}
			
			}