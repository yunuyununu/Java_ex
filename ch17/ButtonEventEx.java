package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// serializable 직렬화

public class ButtonEventEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane; // 패널 안에 여러개를 넣어서 출력

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		// 새로운스레드
			public void run() {
				try {
					ButtonEventEx frame = new ButtonEventEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonEventEx() {  // 생성자
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
		setBounds(100, 100, 450, 300); // x, y, 너비, 높이
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 여백을 준 것

		setContentPane(contentPane); // 내용영역
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnRed = new JButton("Red"); 
		btnRed.addActionListener(new ActionListener() {  // 대상.리스너(처리기)
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		contentPane.add(btnRed); // 패널에 추가하시오
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		contentPane.add(btnBlue);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(btnGreen);
		
		JButton btnYellow = new JButton("Yellow");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.yellow);
			}
		});
		contentPane.add(btnYellow);
	}

}
