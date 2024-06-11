package ch18;

import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) {
		int a = 0;
		try { // throws IOException을 써도 가능
			System.out.print("Input:");
			a = System.in.read(); // 1바이트
			while (a != 13) {
				      // \n 개행문자 new line 줄바꿈
				System.out.println(a + "==>" + (char) a);
				a = System.in.read();
			}
		} catch (IOException e) { // 예외처리클래스 변수
			e.printStackTrace(); // 예외 발생 처리
		}
	}

}
