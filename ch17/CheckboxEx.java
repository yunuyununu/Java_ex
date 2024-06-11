package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class CheckboxEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea ta;
	// 필드변수 , 프로퍼티변수, 멤버변수 (여러줄)
	// JTextField 한줄

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxEx frame = new CheckboxEx();
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
	public CheckboxEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		//메인패널  				추가 패널     위치
		
		JCheckBox ckJava = new JCheckBox("자바");
		//체크박스.add아이템이벤트감시기능(아이템이벤트)
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// ItemEvent e ==> 체크박스 누르면 e에 정보 전달
				if (e.getStateChange() == ItemEvent.SELECTED) {
					// 가져오라 상태변경
					ta.append("Java를 신청했습니다.\n");
					/*
					 텍스트영역.setText(변경할내용)
					 텍스트영역.append(추가할내용)
					 텍스트영역.getText() => 내용
					 */
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					ta.append("Java를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckPython = new JCheckBox("파이썬");
		ckPython.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					ta.append("Python을 신청했습니다.\n");
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					ta.append("Python을 취소했습니다.\n");
				}
			}
		});
		panel.add(ckPython);
		
		JCheckBox ckLinux = new JCheckBox("리눅스");
		ckLinux.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					ta.append("Linux를 신청했습니다.\n");
				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					ta.append("Linux를 취소했습니다.\n");
				}
			}
		});
		panel.add(ckLinux);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
		// 버튼클릭
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 강제종료
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);// 패널 - 추가버튼
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, BorderLayout.EAST);
	}

}
