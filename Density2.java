	class Box
		{
			private int l,b,h;
			Box(int len,int bre,int hei)
				{
					l=len;
					b=bre;
					h=hei;
				}
			Box(Box obj)
				{	
					l=obj.l;
					b=obj.b;
					h=obj.h;
				}
			Box(int len)
				{
					l=b=h=len;
				}
			Box()
				{
					l=b=h=1;
				}
			double volume()
			{return l*b*h;}
		}
		
		class Density extends Box
			{   
					private int mass;
				Density(int l,int b,int h,int m)
					{
						super(l,b,h);
						mass=m;
						
					}
					
				Density(int l,int m)
					{
						super(l);
						mass=m;
						
					}	
				
				Density(Density ob)
					{
						super(ob);
						mass=ob.mass;
						
					}	
				Density(int m)
					{
						super();
						mass=m;
						
					}
				double dense()
				{
					double volume=volume();
					return mass/volume;
				}	
			}
			
		class Density2
			{  
			public static void main(String []args)
					{
				Density box1=new Density(10,20,30,50);
				Density box2=new Density(50,300);
				Density box3=new Density(50);
				Density box4=new Density(box1);
				System.out.println("Volume for box1= "+box1.volume());
				System.out.println("Density of Box1= "+box1.dense());
				System.out.println("Volume for box2= "+box2.volume());
				System.out.println("Density of Box2= "+box2.dense());
				System.out.println("Volume for box3= "+box3.volume());
				System.out.println("Density of Box3= "+box3.dense());
				System.out.println("Volume for box4= "+box4.volume());
				System.out.println("Density of Box4= "+box4.dense());
					}
			}