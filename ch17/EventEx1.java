package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventEx1 extends Frame {
	public EventEx1() {  // 생성자 호출
		addWindowListener(new WindowAdapter() {
		//추가 대상 리스너(감시자)  ( 윈도우 이벤트 처리)
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				// 프로그램 종료
			}
		});
		setSize(300, 300);  // F3-코드 자세히볼때
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx1();
	}
	
}
/*
이벤트 리스너 : 이벤트가 발생했는지 검사
이벤트 핸들러 : 이벤트가 발생했을 때 처리할 코드
 */