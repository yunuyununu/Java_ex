package ch02;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		// Ctrl + Shift + O 자동 import
		Scanner sc = new Scanner(System.in);
		// new 새로 생성
		// new 자료형
		// new Scanner - 메모리에 생성
		// 클래스 = 변수+함수
		System.out.print("반지름을 입력하세요: ");
		double r = sc.nextDouble(); // 소수점형스캐너
		double length = 2 * Math.PI * r; // 원의 둘레
		double area = Math.PI * r * r; // 원의 넓이
		System.out.println("반지름: " + r);
		// % 위치 전체자리수.소수자리수
		System.out.println("둘레:" + String.format("%5.2f", length));
		//                                           형식      값
		System.out.println("넓이:" + String.format("%5.2f", area));
	}

}