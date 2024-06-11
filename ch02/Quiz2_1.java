package ch02;

import java.util.Scanner;

public class Quiz2_1 {
	public static void main(String[] args) {
		/*
		 70점이상이면 합격 아니면 불합격이 나오는 프로그램
		 - 점수는 스캐너로 입력
		 int point = sc.nextInt();
		 */
		Scanner sc = new Scanner(System.in);
		// new Scanner : Scanner 클래스의 인스턴스, 오브젝트 생성
		System.out.print("점수를 입력하시오:");
		int point = sc.nextInt(); // 정수형스캐너
		//       참조변수.변수
		//       참조변수.함수()
		
		//첫번째방법
		System.out.println(point >= 70 ? "합격" : "불합격");
		//두번쨰방법
		if ( point >= 70) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
	}

}
