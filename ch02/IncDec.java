package ch02;
// 패키지 - 디렉토리(폴더)
// 클래스 - 파일
public class IncDec {
// 공개
	public static void main(String[] args) {
		
		int a = 10; // 변수선언 , 초기값할당
		System.out.println(a); // 10
		a++; // 증가연산자 (= a=a+1)
		System.out.println(a); // 11
		
		int b = 10;
		System.out.println(b); // 10
		b--; // 감소연산자 (= b=b-1)
		System.out.println(b); // 9
		
		System.out.println("----------------");
		
		a = 12; // variable 변수
		b = 15;
		--a;
		++b;
		System.out.println(a); // 11
		System.out.println(b); // 16
	}

}