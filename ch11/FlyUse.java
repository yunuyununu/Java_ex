package ch11;

public class FlyUse { // 인터페이스 다중구현 가능
	// {} 중괄호, 블록
	public static void main(String[] args) {
		// 정적    리턴값x     명령행 매개변수
		// 자료형[]=>배열참조변수
		Flyer f = new Drone();
		// 자료형이 다름(상위자료형 = 하위자료형) - 다형성
		f.takeoff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeoff();
		f.fly();
		f.land();
	}

}
