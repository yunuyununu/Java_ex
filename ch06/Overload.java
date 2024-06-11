package ch06;

public class Overload {
	public static void main(String[] args) {
		print(10);  // 정수
		print(100.5);  // 실수
		print("java");  // 문자열
		// 이름같게해도 됨
		/*
		하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것
		< 오버로딩의 조건 >
    	- 메서드의 이름이 같아야 한다.
    	- 매개변수의 개수 또는 타입이 달라야 한다.
		*/
	}
	
	static void print(String str) {
		System.out.println(str);
	}
	
	static void print(double d) {
		System.out.println(d);
	}
	static void print(int i) {
		System.out.println(i);
	}
}