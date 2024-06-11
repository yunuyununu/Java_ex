package ch18;
// 파일 복사 프로그램
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String file1 = "c:/data/a.txt";
		String file2 = "c:/data/b.txt";
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			
			while (true) {
				str = reader.readLine();
				if (str == null) // 널이면 종료
					break;
				writer.write(str + "\r\n"); // 널이 아니면 저장
				// \r 캐리지 리턴
				// \n 줄바꿈
			}
			System.out.println("done");
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
