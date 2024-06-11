package ch04;

import java.util.Scanner;

/*
 섭씨 화씨 계산 프로그램
 섭씨 온도 = (화씨온도-32) / 1.8
 화씨 온도 = (섭씨온도*1.8) + 32
 
 <실행화면>
 섭씨온도를 입력하세요(끝내려면 0을 입력하세요) : 100
 섭씨 100도는 화씨 212도입니다.
 */
public class Quiz4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("섭씨온도를 입력하세요: ");
			double temper = sc.nextDouble(); // 실수형 스캐너
			if ( temper == 0 ) {
				break; // 0이면 종료됨
			}
			double result = ( temper * 1.8 ) + 32;
			System.out.println("섭씨는 " + temper + "도는 화씨" + result + "도 입니다.");
		}
		System.out.println("종료되었습니다.");
	}
}