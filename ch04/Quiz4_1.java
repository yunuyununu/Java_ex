package ch04;
// 1~10 짝수,홀수 구분하는 프로그램
public class Quiz4_1 {
	public static void main(String[] args) {
		int i = 0;
		
		for ( i = 1; i<=10 ; i++) {
			if (i%2==0) {
				System.out.println(i + "는 짝수입니다.");
			} else {
				System.out.println(i + "는 홀수입니다.");
			}
		}
	}
}
// 숫자 + 숫자 => 더하기
// 문자열 + 숫자 / 숫자 + 문자열 / 문자열 + 문자열 => 붙이기