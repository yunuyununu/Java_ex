package ch04;

public class BreakEx {
	public static void main(String[] args) {
		int i = 1;
		while ( true ) {
			System.out.println(i++);
			if ( i > 10 )
				break;
		}
	}

}
