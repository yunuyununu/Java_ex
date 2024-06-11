package ch02;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
		System.out.println(num > 0 ? num : -num); // 5
		//                (  조건   ? true : false)
		
		// if문으로 표현가능
		if (num > 0) { // 조건true
			System.out.println(num);
		} else { // 조건false
			System.out.println(-num); // 5
		}
		
		System.out.println(Math.abs(num)); // 절댓값구하기 5
	}

}