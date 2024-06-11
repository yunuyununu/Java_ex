package ch18;
// 입력한 내용 파일에 저장되는 프로그램
import java.io.FileOutputStream;
import java.io.OutputStream;
// 프로그램 => 파일

public class FileWrite {
	public static void main(String[] args) {
		OutputStream os = null; // 자료형 주소저장 숫자x
		// 로컬변수는 반드시 초기화
		try {
			os = new FileOutputStream("c:/data/test.txt");
			//   파일에 내용 저장         파일경로
			System.out.print("Input:");
			while (true) { // 무한반복
				int ch = System.in.read(); // 1바이트씩 읽음
				System.out.println(ch + "==>" + (char) ch);
				if (ch == 13) // 줄바꿈문자(엔터)					
					break; // 종료
				os.write(ch);
			}
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}