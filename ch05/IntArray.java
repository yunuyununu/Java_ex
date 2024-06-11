package ch05;
// 배열 array

public class IntArray {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80 };
//        = int[] nums;
//          nums=new int[5];
//          nums[0]=10;
//          nums[1]=20;
//          nums[2]=30;
//          nums[3]=40;
//          nums[4]=50;
		for ( int i = 0; i < nums.length; i++) { // 이 방법을 자주씀
			//              배열참조변수.length => 데이터수
			System.out.println(nums[i]); // 10~80
		}
		for (int n : nums) {   // 세부적인값 : 배열
			System.out.println(n); // 10~80
		}
	}
}
// int num; 변수 1개
// int[] num; 
// 정수배열을 참조하는 변수(참조변수)
// () 소괄호 {} 중괄호 [] 대괄호
// nums ==> 10, 20, 30, 40, 50
// 1번지     1번지
// 실제값 / 주소값
// nums[인덱스

// 메모리 할당 방식 - 정적 할당: 컴파일할때, 동적 할당: 실행할때 runtime / new