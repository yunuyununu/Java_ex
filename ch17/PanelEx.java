package ch17;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame { 
	//               상속
	public PanelEx() {
		JPanel p = new JPanel(); 
		// 컴포넌트 - 화면구성 도구-버튼, 체크박스
		// 컨테이너 - 컴포넌트를 담을 수 있는 그릇
		p.setBackground(Color.orange); // 배경색상 설정
		JButton button1 = new JButton("Button 1"); // 버튼객체(버튼속 텍스트)
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		p.add(button1); // 패널.추가(버튼)
		p.add(button2);
		p.add(button3);
		add(p); // => 프레임에 추가 (패널)
		setSize(300, 300); // 화면사이즈
		setVisible(true); // 화면표시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 닫기동작
	}
	
	public static void main(String[] args) {  // 항상 메인에서 시작
		new PanelEx();
		// 인스턴스 생성 생성자 호출
	}

}
