package ch18;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileRead extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileRead frame = new FileRead();
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
	public FileRead() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(35, 38, 116, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton button1 = new JButton("OK");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String file = tf.getText(); // 텍스트필드
				String str = "";
				BufferedReader reader = null; // 버퍼사용리더 // 0도 넣을수 없음
				try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					ta.setText(""); // 텍스트 지우기
					while ((str = reader.readLine()) != null) { // 한라인 읽음
						ta.append(str + "\n");
						// 기존내용 끝에 추가 줄바꿈
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				} finally { // 항상 실행
					try {
						if (reader != null) // 붙임요망
							reader.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		button1.setBounds(163, 37, 97, 23);
		contentPane.add(button1);
		
		ta = new JTextArea();
		ta.setBounds(35, 79, 253, 153);
		contentPane.add(ta);
	}

}
