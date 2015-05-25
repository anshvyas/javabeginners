	
	//Overidding and Hiding
	class Animal
		{
			public void show1(){System.out.println("Hello!!!This is animal");}
			public static void show(){System.out.println("Hello!!!This is animal");}
		}
		
	class Cat extends Animal
		{
			public void show1(){System.out.println("Hello!!!This is cat");}
			public static void show(){System.out.println("Hello!!!This is cat");}
		}
		
	class Hiding
		{
		public static void main(String []args)
				{
				
			Cat c1=new Cat();
			//Cat c2=new Animal();
			Animal a1=new Animal();
			Animal a2=c1;
			//c2.show();
			System.out.println("Method Overidding: ");
			System.out.println("Call by cat: ");
			c1.show1();
			a2=a1;
			System.out.println("Call by animal: ");
			a2.show1();
			System.out.println("Static Method Hidding: ");
			System.out.println("Call by cat: ");
			Cat.show();
			System.out.println("Call by animal: ");
			Animal.show();
				}
		}