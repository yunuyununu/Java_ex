package ch14;

public class ThrowEx {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000); // 1초에 하나씩 출력 1000ms
		}
	}
}
// add throws declaration
// surround with try/catch