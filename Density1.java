class Density1
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