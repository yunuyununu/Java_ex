package ch04;

import java.util.Random;
import java.util.Scanner;

/*
  랜덤숫자돌리기 게임 프로그램
  1~100 사이의 값을 반복적으로 입력하여 컴퓨터가 랜덤으로 생성한 값을 맞추면 몇번만에
  숫자를 맞췄는지 출력하고 게임이 끝난다.
  
  Random rand = new Random();
  int num = rand.nextInt(100)+1;
  
  < 실행 화면 >
  컴퓨터의 숫자:60
  1~100 사이의 값을 입력하세요 : 50
  더 큰 수를 입력하세요.
  
  1~100 사이의 값을 입력하세요 : 70
  더 큰 수를 입력하세요.
  
  1~100 사이의 값을 입력하세요 : 60
  3회만에 맞췄습니다.
  
 */
public class Quiz4_2 {
	public static void main(String[] args) {
		Random r = new Random();
		int com = r.nextInt(100)+1; // 1~100사이 숫자 랜덤
		System.out.println("컴퓨터의 숫자:" + com); // 랜덤숫자나옴
		
		Scanner sc = new Scanner(System.in);
		int user;
		int count = 0;
		 while (true) {
	         System.out.print("숫자를 입력하세요:");
	         user = sc.nextInt();
	         count++; // 몇번 시도했는지
	         if (com == user) {
	            System.out.println("맞았습니다.");
	            System.out.println(count + "회만에 맞히셨네요^^");
	            break; // 맞추면 종료됨
	         } else if (com > user) {
	            System.out.println("더 큰 수를 입력하세요.");
	         } else if (com < user) {
	            System.out.println("더 작은 수를 입력하세요.");
	         }
	      }

		
	}
}