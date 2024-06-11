package ch02;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력  참조   생성         입력스트림
		// InoutStream  OutStream
		System.out.print("이름을 입력하시오:");
		String name = sc.next(); // 문자열형 스캐너 // 참조변수.함수()
		System.out.print("Java점수를 입력하시오:");
		int java = sc.nextInt(); // 정수형 스캐너
		System.out.print("DB점수를 입력하시오:");
		int db = sc.nextInt();
		System.out.print("Math점수를 입력하시오:");
		int math = sc.nextInt();
		int tot = java + db + math;
		double avg = tot / 3.0; // 정수/정수=>정수 , 정수/실수=>실수 , 실수/정수=>실수
		System.out.println("Name:" + name);
		System.out.println("Java:" + java);
		System.out.println("DB:" + db);
		System.out.println("Math:" + math);
		System.err.println("Tot:" + tot);
		System.out.println("Avg:" + String.format("%5.1f", avg));
		// 정수 5바이트 - 고정소수점 , 소수3바이트 - 부동소수점
	}
}