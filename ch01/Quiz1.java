package ch01;

public class Quiz1 {
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
	
	
	public static void main(String[] args) {
		String name = "김철수";
		int year = 1990;
		System.out.println(name + "의 나이는 만 "+ (2023-year) + "세입니다.");
	}

}
