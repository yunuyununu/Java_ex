package ch06;

public class ReturnSum {
	static int sum(int a) {
		int result = 0;  // 합계 저장 변수
		for (int i = 1; i <= a; i++) {
			result = result + i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n = sum(50); // 위 함수에 50을 넣고 돌린 값이 나옴
		System.out.println(n);
		n = sum(100); // 위 함수에 100을 넣고 돌린 값이 나옴
		System.out.println(n);
	}
}