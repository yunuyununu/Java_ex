package ch03;

/* 
윤년 테스트 - if함수에 And,OR을 이용하여 구하기
- 해당 연도를 4로 나눈 값이 0
- 그 중 100으로 나눈 값이 0인 것은 제외
- 400으로 나눈 값이 0인 것
*/

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요:");
		int year = sc.nextInt(); // 정수형 스캐너 - 숫자 입력
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		//  4의 배수           100의 배수가 아님      400의 배수
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}
}

// 에러-완전틀림 , 경고-성능관련 , 예외-네트워크관련
// thread - 작업단위 (single, multi)
// InputMismatchException
// 입력값 형식이 맞지 않을 때