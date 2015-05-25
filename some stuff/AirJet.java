abstract class AirPlane {
	abstract void fly();
	void land() { // line 5
		System.out.print("Landing..");
	}
}
class AirJet extends AirPlane {

	AirJet() {
		super(); // line 14
	}
	void fly() {
		System.out.print("Flying..");
	}
	
	public static void main(String []args)
			{
				new AirJet();
			}

}
