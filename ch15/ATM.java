package ch15;

public class ATM extends Thread { // 멀티스레드 지원
	private int deposit = 100000; // 10만원 잔액

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			withdraw(10000); // 1만원씩 인출
		}
	}
	
	public synchronized void withdraw(int money) {
		// 동기화(순서대로 처리) - 멀티스레드x
		String name = Thread.currentThread().getName();
		//            현재 실행중인 스레드 이름
		if (deposit > 0) { // 잔고 있으면
			deposit = deposit - money;
			System.out.println(name + "-잔액:" + deposit);
		} else {
			System.out.println(name + "-잔액이 없습니다.");
		}
	}
}