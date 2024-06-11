package ch18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in);
		// 바이트 단위        문자단위, 알파벳 1바이트,한국어 2바이트
		System.out.print("input:");
		// 예외처리 필수
		// 입출력
		// cpu 간섭 인터럽트
		// 네트워크
		// DB
		try {
			while (true) { // 무한반복
				var = input.read(); // 한글자
				if (var == 13)
					break;
				System.out.println(var + "==>" + (char) var);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
