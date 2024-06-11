package ch06;

public class MultiTable {
	static void table(int n) { // table 함수 (정수형 변수명)
		System.out.println("=== Table " + n + "===");
		for (int i = 1; i<= 9; i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
	}
	static void allTable() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("=== Table " + i + "===");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
	public static void main(String[] args) {  // 메인
		table(3); // table 함수호출 - 3단
		table(5); // table 함수호출 - 5단
		
		for (int i = 2; i <= 9; i++) {  // 2~9단
			table(i);
		}
		allTable(); // 2~9단
	}
}