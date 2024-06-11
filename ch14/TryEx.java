package ch14;

public class TryEx {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		try {
			for (int i = 0; i <= nums.length; i++) {  // 부등호가 잘못됨.(<)
				System.out.println(nums[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();  // 스택추적정보 출력
		}
		System.out.println("종료");
	}

}
