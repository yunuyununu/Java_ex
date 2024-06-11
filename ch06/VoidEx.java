package ch06;

public class VoidEx {
	static void hello() {
		System.out.println("hello"); // hello();로 호출
	}
	// 리턴타입 함수이름() {  명령어  }
	// 리턴타입 : 되돌려주는 값의 자료형
	// 리턴값 없음 ==> void
	
	public static void main(String[] args) {
		System.out.println("start");
		hello();  // 함수호출
		System.out.println("end");
	}
}