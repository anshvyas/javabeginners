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