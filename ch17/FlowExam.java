package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowExam extends JFrame {
	public FlowExam() {
		setLayout(new FlowLayout()); // 레이아웃 변경
		// JFrame => 기본 Borderlayout
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		add(button1);
		add(button2);
		add(button3);
		
		setSize(400, 200); // 화면사이즈
		setVisible(true); // 화면표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 닫기동작
		
	}
	public static void main(String[] args) {
		new FlowExam();
	}

}
