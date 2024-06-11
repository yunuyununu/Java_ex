package ch15;

public class ThreadEx1 extends Thread {
	public ThreadEx1(String name) {
		super(name);  // 스레드의 이름
		// this.멤버 현재 클래스의 멤버
		// this() 현재 클래스의 생성자
	}

	@Override
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadEx1 e1 = new ThreadEx1("thread 1");
		ThreadEx1 e2 = new ThreadEx1("thread 2");
		ThreadEx1 e3 = new ThreadEx1("thread 3");
		e1.start(); // run() 실행
		e2.start();
		e3.start();
	}

}