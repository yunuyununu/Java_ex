package ch06;

public class Call {
	static void test1(int b) {  // void는 리턴값 없음
		System.out.println(b);
	}
	
	static void test2(int[] n) {
		for (int i = 0; i < n.length; i++) { // n의 길이는 5
			System.out.print(n[i] + "\t"); // nums의 배열이 들어감
			//          배열참조변수[인덱스]
		}
	}
	public static void main(String[] args) {
		int a = 10; // 변수 = 10
		test1(a); // 함수 = 메서드
		int[] nums = { 10, 20, 30, 40, 50 }; // 배열 참조변수
		test2(nums);
	}
}