package ch03;

import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		int point_use = 0; // 사용포인트
		int fee = 0; // 배송비
		int pay = 0; // 지불할 총금액
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오:");
		String name = sc.next(); // 문자열 스캐너
		System.out.print("상품가격을 입력하시오:");
		int price = sc.nextInt(); // 정수 스캐너
		System.out.print("포인트를 입력하시오:");
		int point = sc.nextInt();
		
		if (price < 20000) {   // 상품가격이 2만원이하일때 배송비 2천원
			fee = 2000;
		}
		if (point >= 10000) {   // 포인트가 1만 이상일때
			if ( point > price ) {   // 포인트 > 상품가격
				point_use = price;
				pay = 0;    // 포인트로만 상품구매 , 지불할금액 없음
			} else {                // 포인트 < 상품가격
				point_use = point;
				pay = price + fee - point;
			}
			
		} else {                // 포인트가 1만 이하일때
			pay = price + fee;
		}
		
		System.out.println("이름:" + name);
		System.out.println("상품가격:" + String.format("%,d",price));
		System.out.println("배송비:" + fee);
		System.out.println("포인트 사용:" +  point_use);
		System.out.println("남은 포인트:" + (point - point_use));
		System.out.println("금액:" + String.format("%,d", pay));
		// 금액단위에 , 찍고싶을때
		// System.out.println("금액:" + String.format("%,d", pay));
		// %d 10진수 , %,d 천단위 컴머
	}

}
