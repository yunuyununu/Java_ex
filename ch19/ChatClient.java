package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Socket socket = null;
		PrintWriter writer = null;
		BufferedReader reader = null;
		try { // 2. 접속시도
			socket = new Socket("localHost", 5555);
			// 					 서버에 접속=>accept
			writer = new PrintWriter(socket.getOutputStream(), true);
			// 클라이언트
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receive = "";
		String send;
		Scanner sc = new Scanner(System.in);
		while (true) {
			receive = reader.readLine(); // 서버에서 보낸 내용
			// 5.서버에서 환영메세지 수신
			System.out.println("[server]" + receive);
			if(receive.equals("q")) // 내용이 q이면
				break; // 종료
			System.out.println("input(quit:q):");
			send = sc.nextLine(); // 키보드입력
			if(send.equals("q")) {
				break;
			}
			if(send != null) {
				writer.println(send);
			}
		}
		sc.close();
		writer.close();
		reader.close();
		socket.close();
		
	}

}
