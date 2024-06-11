package ch04;
// 다중 for문
// nested loop 중첩된 루프
public class MultiTable2 {
	public static void main(String[] args) {
		for ( int i = 2; i <= 9; i++) {
			System.out.println("[table " + i + "단]");
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}
