package ch15;

public class SingleThread {
	void print() {
		System.out.println(Thread.currentThread().getName());
		//                        현재 실행중인 스레드 이름출력
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) { 
		// static 안에 print();는 new를 해주어야함.
		SingleThread t = new SingleThread();
		t.print();
		t.print();
	}

}
