package ch03;

import java.util.Scanner;

public class Point1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int point = sc.nextInt();
		String grade = "";
		if (point >= 90 && point <= 100) {
			grade = "A";
		} else if ( point >= 80 && point < 90 ) {
			grade = "B";
		} else if ( point >= 70 && point < 80 ) {
			grade = "C";
		} else if ( point >= 60 && point < 70 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("등급:" + grade);
	}

}
