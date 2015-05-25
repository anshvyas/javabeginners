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
			