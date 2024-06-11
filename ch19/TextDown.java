package ch19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TextDown {
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("https://raw.githubusercontent.com/selva86/datasets/master/ozone.csv");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// url에 접속
			if (conn != null) {
				conn.setConnectTimeout(3000); // 3초
				if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
					// 인코딩형식
					BufferedWriter bw = new BufferedWriter(new FileWriter(new File("c:/data/ozone.csv")));
					while (true) { // 무한반복
						String line = br.readLine(); // 한라인씩 읽음
						if (line == null) // null이면 더이상 내용x
							break;
						bw.write(line + "\r\n");
					}
					br.close();
					bw.close();
					System.out.println("done");
				}
				conn.disconnect();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
