package ch15;

public class ThreadEx2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("thread 1");
		MyThread t2 = new MyThread("thread 2");
		t1.start(); // 작업요청 => run() 실행
		t2.start();

	}

}
// 동시에 여러작업을 함