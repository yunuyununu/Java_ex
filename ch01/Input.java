package ch01;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자료형 변수 새로생성 자료형(키입력장치)
		System.out.print("이름을 입력하세요:");
		String name = sc.next();
		// 변수        키보드 입력값
		System.out.println("Name: " + name);
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		//        키보드 정수 입력
		System.out.println("Age: " + age);
	}

}

// 데이터 =>변수
// 기능 => method, function

// 운영체제에 독립적 - java , python
// 운영체제에 종속적 - c