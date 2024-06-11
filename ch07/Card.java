package ch07;

public class Card {
	 String kind ;    // 카드의 무늬 - 인스턴스 변수
     int number;      // 카드의 숫자 - 인스턴스 변수
     static int width = 100;     // 카드의 폭 - 클래스 변수
     static int height = 250;    // 카드의 높이 - 클래스 변수
}

// Card인스턴스는 자신만의 무늬(kind), 숫자(number)를 유지 = 인스턴스변수
// 카드들의 폭(width), 높이(height)는 모든 인스턴스가 공통적으로 같은 값을 유지 = 클래스변수 