package ch12;

public class Wrapper {
	public static void main(String[] args) {
		Integer i1 = 10;
		// 클래스
		int num1 = i1.intValue();
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println(sum); // 30
		System.out.println(Integer.toBinaryString(sum)); // 10진수를 2진수로 // 30을 2진수로 표현
		System.out.println(Integer.parseInt("100")); // 정수를 추출
		System.out.println(Integer.toString(100)); // 정수를 스트링으로 바꿔주는
		System.out.println(100 + ""); // 100+"" = "100"
	}

}
