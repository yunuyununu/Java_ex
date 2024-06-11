package ch05;
// 입력한 숫자들의 합계를 구하는 프로그램
import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int[] nums = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Number " + (i+1) + ":");
			nums[i] = sc.nextInt(); // 정수형 스캐너
			sum = sum + nums[i];
		}
		System.out.println("Sum:" + sum);
		// sc.close(); 스캐너 닫기기능 - 성능을 위해
	}
}