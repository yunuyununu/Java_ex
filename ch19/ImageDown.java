package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ImageDown {
	public static void main(String[] args) throws Exception {
		String img = "https://cdn.pixabay.com/photo/2023/10/01/16/01/rose-8287698_640.jpg";
		// 			  https 보안 도메인, 호스트   
		URL url = new URL(img);
		byte[] buffer = new byte[4096];
		// 바이트배열			    버퍼사이즈
		
		InputStream in = url.openStream();
		OutputStream out = new FileOutputStream("c:/data/test.jpg");
		int length = 0;
		while ((length = in.read(buffer))!= -1) { 
				// 바이트수 = 읽음  버퍼사용	  다 읽으면 -1
			System.out.println(length + "바이트 읽음");
			out.write(buffer, 0, length);
			// 파일저장  버퍼  offset
		}
		System.out.println("done");
	}

}
