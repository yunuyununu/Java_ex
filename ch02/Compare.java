package ch02;

public class Compare {
	public static void main(String[] args) {
		int a = 65;
		char c = 'A';
		char d = 'a';
		System.out.println((int) c); // 65 - c(문자형)을 정수형으로 변환
		System.out.println((int) d); // 97 - c(문자형)을 정수형으로 변환
		
		System.out.println(a == c); // 비교 (true/false)
		System.out.println(a = c); // c = 65를 대입
		
		System.out.println(a == d); // false
		System.out.println(a = d); // d = 97을 대입
		
	}

}