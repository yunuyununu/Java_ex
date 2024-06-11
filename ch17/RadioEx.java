package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class RadioEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup(); // 변경x  라디오버튼그룹

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioEx frame = new RadioEx(); // 프레임생성, 생성자호출
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
	public RadioEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdoRed = new JRadioButton("red");
		// 라디오버튼            생성			텍스트
		rdoRed.addItemListener(new ItemListener() {
		// 라디오버튼.add아이템Listener(처리기)
			public void itemStateChanged(ItemEvent e) { // 아이템 상태 바뀌면
				contentPane.setBackground(Color.RED);
				// 프레임의 내용 영역 배경색상
			}
		});
		buttonGroup.add(rdoRed);
		// 버튼그룹   추가 라디오버튼
		contentPane.add(rdoRed);
		// 패널      추가 라디오버튼
		
		JRadioButton rdoGreen = new JRadioButton("green");
		buttonGroup.add(rdoGreen);
		rdoGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(rdoGreen);
		
		JRadioButton rdoBlue = new JRadioButton("blue");
		buttonGroup.add(rdoBlue);
		rdoBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		contentPane.add(rdoBlue);
	}

}
