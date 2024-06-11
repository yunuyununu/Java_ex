package ch03;

/* 
윤년 테스트2 - 윤년함수로 구하기
- 해당 연도를 4로 나눈 값이 0
- 그 중 100으로 나눈 값이 0인 것은 제외
- 400으로 나눈 값이 0인 것
*/

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Year2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오:");
		int year = sc.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar(); // 윤년함수
		if (gc.isLeapYear(year)) { // = 윤년이라면
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 평년입니다.");
		}
	}
}