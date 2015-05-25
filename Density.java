	class vol
	{
		int l,b,h;
		vol(int len,int bre,int hei)
			{
				l=len;
				b=bre;
				h=hei;
			}
			int volume()
			{ return l*b*h;}
	}
	
	class dense extends vol  
		{
			int mass;
			dense( int l,int b,int h,int m)
						{
					super(l,b,h);//invoke constructer of superclass
					mass=m;
					System.out.println("Lenght= "+l+" Breath= "+b+" Height= "+h+" Mass= "+mass);
						}
			double density()
					{
				double vol=volume();
				System.out.println("Volume= "+volume());
				return mass/vol;
					}
		
		}
	class Density
			{
				public static void main(String []args)
					{
				dense box=new dense(10,20,30,50);
				System.out.println("Density= "+box.density());
				Object obj=new dense(15,15,15,6000);// implicit cast
				dense obj1=(dense)obj;// explicit casting
				if(obj instanceof dense )// check for explicit cast
				System.out.println("Density= "+obj1.density());
				else
				System.out.println("Sorry!!!!!");
					}
			}