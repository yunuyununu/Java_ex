package ch16;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerEx2 extends Frame {
	public InnerEx2() {    // 생성자
		setSize(300, 400); // 화면사이즈
		setVisible(true);  // 화면실행
	}
	
	public static void main(String[] args) {
		InnerEx2 e = new InnerEx2();
		e.addWindowListener(new WindowAdapter() {
			// 추가 윈도 감시,감찰
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 프로그램종료
			}
		});
	}

}