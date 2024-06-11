package ch05;

public class ArraySum {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		//    시작주소
		//    인덱스     0   1   2   3   4
		System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[4]);
		nums[2]=300;
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);
	}
}
// 자료형 변수명;
// int a; 1개의 데이터
// 자료형[] 참조변수명;
// new 생성 => 동적메모리 할당