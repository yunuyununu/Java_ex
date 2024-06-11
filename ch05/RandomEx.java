package ch05;
// 로또번호 추첨하기
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random rand = new Random(); // ()안에 숫자를 넣으면 값이 고정됨
		int[] nums = new int[10];
		for ( int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100) + 1; // 정수난수 0~99 +1 = 1~100
			System.out.println(nums[i]);
		}
	}
}