package ch17;

import javax.swing.JFrame;

public class JFrameExam {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500); // 가로,세로
		f.setVisible(true); // 화면표시
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램종료기능
	}

}