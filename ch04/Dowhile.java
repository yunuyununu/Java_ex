package ch04;

public class Dowhile {
	public static void main(String[] args) {
		// static 정적, 시작~끝 메모리에 유지
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while ( i <= 10 );
	}
}
// tree 트리구조