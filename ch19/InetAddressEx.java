package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		try {
			
			InetAddress address = InetAddress.getByName("naver.com");
			System.out.println(address);
			// 1개의 ip
			// 자료형[] => 배열참조 자료형
			InetAddress[] addresses = InetAddress.getAllByName("naver.com");
			for (InetAddress i : addresses) {
			//    개별             배열
				System.out.println(i);
			}
		} catch (UnknownHostException e) { // 예외발생할 때
			e.printStackTrace();
			// 출력  스택 추적정보
		}
	}
}