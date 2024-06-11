package ch03;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "는 짝수입니다."); // 짝수
		} else {
			System.out.println(num + "는 홀수입니다."); // 홀수
		}
	}
}