package ch04;

public class ContinueEx {
	public static void main(String[] args) {
		for ( int i = 1; i <= 10; i++) {
			if ( i % 5 == 0 )
				continue; // 해당사항 건너뜀. 5,10일때
			System.out.println(i);
		}
	}
}