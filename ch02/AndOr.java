package ch02;

public class AndOr {
	public static void main(String[] args) {
		// && (AND연산자 - 둘다 참이어야 true
		// || (OR연산자 - 하나만 참이여도 true
		int a = 27;
		System.out.println(a >= 20 && a < 30); // true
		System.out.println(a >= 20 || a < 30); // true
		
		int b = 37;
		System.out.println(b >= 20 && b < 30); // false
		System.out.println(b >= 20 || b < 30); // true
	}

}