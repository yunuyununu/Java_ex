package ch04;
// 합계계산 프로그램
public class Sum {
	public static void main(String[] args) {
		int num = 1000;
		int sum = 0;
		for ( int i = 1; i <= num; i++) { // 1부터 100까지 총합계
			// 1         2         4
			sum = sum + i; // 3
		}
		System.out.println(sum);
	}
}