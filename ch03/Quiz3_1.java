package ch03;

import java.util.Scanner;

/* 택시요금계산
   
   1. 운행거리 2km까지는 기본요금 4800원을 적용한다.
   2. 운행거리가 1.6km를 넘으면 131m마다 100원씩으로 계산한다.
*/
public class Quiz3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("운행거리를 입력하시오(km):");
		double km = sc.nextDouble(); // 실수형 스캐너
		double m = km * 1000; // 1km = 1000m
		int fee = 0; // 초기값 설정
		
		if (m <= 2000) { // 운행거리 2km일 때 기본요금 4800원
			fee = 4800;
		} else { // 운행거리가 1.6km 부터 131m마다 100원씩
			double temp = m - 1600; // 1.6km 넘는 거리계산
			fee = 4800 + (((int) Math.ceil(temp / 131.0)) * 100);
			System.out.println("1.6km초과거리 = " + (int)temp + "m");
			//  = 기본요금 + {(1.6km 넘는거리를 131로 나눈 후 올림 - 정수형으로) * 100씩부과}
			// 반올림 Math.round()
			// 올림 Math.ceil()
			// 버림 Math.floor()
		}
		System.out.println("요금:" + String.format("%,d", fee) + "원");
	}
}
