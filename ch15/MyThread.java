package ch15;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "==>" + i);
			try {
				Thread.sleep(1000); // cpu 1초 멈춤, 인터럽트
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}