package ch04;

import java.util.Scanner;

public class MultiTable1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하시오:");
		int num = sc.nextInt();
		System.out.println(num + "단계 곱셈식");
		for ( int i = 1; i <= 9; i++) {
			//시작        검사     조건변경
			System.out.println(num + "x" + i + "=" + num * i);
		}
	}
}