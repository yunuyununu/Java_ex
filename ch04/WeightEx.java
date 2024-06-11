package ch04;

/*
 몸무게 감량 프로그램
 - 현재몸무게, 목표몸무게를 입력
 - 목표몸무게 이하가 되면 감량한 현재 몸무게를 출력
 - 목표몸무게 될때까지 계속해서 n주차까지 감량
*/

import java.util.Scanner;

public class WeightEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게를 입력하시오:");
		int now_wet = sc.nextInt();
		System.out.print("목표몸무게를 입력하시오:");
		int goal_wet = sc.nextInt();
		
		int num = 1;
		while ( now_wet > goal_wet ) { // 조건: 현재가 목표보다 클때
			System.out.println(num + "주차 감량 몸무게: ");
			num++;
			int s = sc.nextInt();
			now_wet = now_wet - s;
			
		}
		System.out.println(now_wet + "kg 달성 !! 축하드립니다!~");

	}

}
