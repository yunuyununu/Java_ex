package ch17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame { // 자바는 상속1개
	public BorderExam() {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		add(button1); // 센터배치
		// 프레임에 추가(버튼)
		add(button2, "North"); // add(컴포넌트, 위치)
		add(button3, "South"); 
		add(button4, "East");
		JPanel p = new JPanel(); 
		p.add(button5);
		p.add(button6);
		// 패널 안에 5,6 넣고
		add(p, "West"); // 왼쪽에 패널을 출력
		
		setSize(500, 500); // 화면사이즈
		setVisible(true); // 화면표시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 닫기동작
		
	}
	
	public static void main(String[] args) {
		new BorderExam();
	}

}
