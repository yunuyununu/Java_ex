package ch10;

public class StaticEx {
	public static void main(String[] args) {
		int a = 40, b = 30 , result;
		result = Math.max(a,  b);
		System.out.println(result);
		result = Math.min(a,  b);
		System.out.println(result);
		System.out.println(Math.sqrt(100)); // Math.sqrt(값) : 제곱근
		
		double r = 15.3;
		System.out.println("원의 둘레 : " + (int)(2 * Math.PI * r));
		System.out.println("원의 넓이 : " + (int)(Math.PI * r * r));
	}
}