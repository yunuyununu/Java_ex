package ch06;

import java.util.Scanner;

/*
[문제] 아래와 같이 반지름값을 입력받아 원의 둘레와 넓이를 계산하는 프로그램 (두가지 방법- 입력값 , 스캐너)

<처리 조건>
원주율은 Math.PI 를 사용한다.
결과값은 소수 둘째 자리에서 반올림 처리한다.( String.format() 사용 )

<결과 출력>
반지름을 입력하시오 : 10
반지름 : 10
원의 둘레 : 62.83
원의 넓이 : 314.16
*/
public class Quiz6_1 {
	static double length(double r) {
		return 2 * Math.PI * r;  // 2 x 원주율 x 반지름
	}
	static double area(double r) {
		return Math.PI * r * r;  // 원주율 x 반지름 x 반지름
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		double r = sc.nextDouble(); // 실수형 스캐너
		double a = length(r); // 함수호출
		double b = area(r);
		System.out.println("반지름 : " + (int)r);
		System.out.println("원의 둘레 : "+ String.format("%.2f", a)); // 소수둘째자리수까지
		System.out.println("원의 넓이 : "+ String.format("%.2f", b)); // 소수둘째자리수까지
	}

}
