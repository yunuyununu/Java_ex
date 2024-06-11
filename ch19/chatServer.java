package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;
		try { // 1.서비스 개시
			serverSocket = new ServerSocket(5555);
			System.out.println("started...");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error...");
			System.exit(1);
		}
		Socket clientSocket = null;
		try { // 3.접속허가
			clientSocket = serverSocket.accept();
			// 대기중, 사용자 접속, 허가, 통신회선 연결
			System.out.println("client's ip:" + clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		//   서버=> 클라이언트 출력용
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		//   클라이언트=> 서버입력용
		String receive = "";
		String send = "Welcome!!!";
		writer.println(send);
		// 4.환영메세지 보냄
		Scanner sc = new Scanner(System.in);
		while (true) {
			receive = reader.readLine();
			// 6.클라이언트 메세지 수신
			if(receive == null || receive.equals("q")) {
				// 내용이 없거나		q이면
				break; // 종료
			}
			System.out.println("[client] " + receive);
			System.out.println("input(quit:q):");
			send = sc.nextLine(); // 서버=> 클라이언트 보낼 메시지
			writer.println(send); // 전송
			// 클라이언트 메세지
			if(send.equals("q")) {
				break;
			}
		}
		sc.close(); // 스캐너 닫기
		writer.close(); // 스트림 종료
		reader.close();
		clientSocket.close(); // 소켓 닫기
		serverSocket.close();
		
	}

}
