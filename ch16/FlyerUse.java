package ch16;

public class FlyerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {  // 무명클래스

			@Override
			public void takeoff() {
				System.out.println("take off");
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
			}

			@Override
			public void land() {
				System.out.println("land");
			}
			
		};
		
		f.takeoff();  // take off
		f.fly();	  // fly
		f.land();	  // land
	}

}
