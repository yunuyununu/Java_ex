package ch01;

public class LongEx {
	public static void main(String[] args) { // main + Ctrl + Space
		// int, short, long은 정수형
		int a = 2147483647;
		
		System.out.println(a); // syso + Ctrl + Space
		long b = 2147483648L; // long 뒤에 L 또는 ㅣ 붙여야함
		System.out.println(b);
		
		System.out.println(Integer.MIN_VALUE); // Integer(클래스)의 최소,최대
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE); // SIZE는 비트수 // 32bit
		
		System.out.println(Long.MIN_VALUE); // Long(클래스)의 최소,최대
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE); // 64bit
		
	}
}