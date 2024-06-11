package ch01;

import java.util.Scanner; // 스캐너를 이용하여 풀기

public class Quiz1_1 {
	public static void main(String[] args) {
		/*
		[문제]
		아래와 같이 나이를 계산하여 출력하는 코드를 작성하시오.
		
		<처리조건>
		1. 이름과 출생연도는 변수에 고정값으로 입력하거나 사용자가 입력한 값으로 처리한다.
		String name = "김철수";
		int year = 1990;
		
		2. 나이는 현재 연도(4자리 숫자)에서 출생연도값을 뺀 값으로 처리한다.
		2023-year
		
		<결과값>
		김철수님의 나이는 만 ...세입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오:");
		String name = sc.next();
		System.out.println("Name: " + name);
		System.out.print("출생연도를 입력하시오:");
		int year = sc.nextInt();
		int age = 2023-year;
		System.out.println("Year: " + year);
		System.out.println(name + "의 나이는 만 "+ age+ "세입니다.");
		
	}
}