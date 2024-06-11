package ch04;
// 오른쪽으로 기울어진 별트리 만들기
public class Star2 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for ( int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for ( int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}