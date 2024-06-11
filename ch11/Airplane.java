package ch11;

public class Airplane implements Flyer { // implements + 인터페이스 구현

	@Override
	public void takeoff() {
		System.out.println("Airplane 이륙");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");
	}
	
}
