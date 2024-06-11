package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class MultiTableServer implements Runnable {
	private ServerSocket serverSocket;
	// 소켓 - 논리적
	private Socket socket;
	// 데이터통신용 소켓
	private DataInputStream dis;
	
	private DataOutputStream dos;
	// 필드 변수 프로퍼티 변수
	public MultiTableServer() { // 생성자
		try {
			serverSocket = new ServerSocket(9999);
			// 				   서버소켓 -서비스제공 (포트번호)
			System.out.println("started...");
		} catch(Exception e) {
			e.printStackTrace();
		}
		while (true) { // 무한반복
			try {
				socket = serverSocket.accept();
				// 		  클라이언트 접속 허가
				InetAddress ip = socket.getInetAddress();
				//  클라이언트의 ip 주소
				System.out.println("client's ip:" + ip);
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				Thread th = new Thread(this);
				th.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) { // 시작
		new MultiTableServer();
	}
	@Override
	public void run() {
		try {
			while (true) { // 무한반복
				int table = dis.readInt(); // 서버에 수신
				//  		    클라이언트의 입력값, 정수로
				StringBuilder sb = new StringBuilder();
				for (int i = 1; i <= 9; i++) {
					sb.append(table + "x" + i + "=" + table*i + "\r\n");
					// append() 는 끝에 추가
				}
				dos.writeUTF(sb.toString());
				// 클라이언트
			}
		} catch (SocketException e) {
			System.out.println("클라이언트의 연결이 끊어졌습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
