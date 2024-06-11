package ch17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MessageEx extends JFrame { // 확장/상속

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageEx frame = new MessageEx();
					//                인스턴스 생성
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
	public MessageEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
		// 닫기 동작
		setBounds(100, 100, 450, 300);
		// 프레임의 좌표, 사이즈
		contentPane = new JPanel();
		// 컴포넌트 > 컨테이너
		// JFrame
		// JPanel
		// JButton
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton Button1 = new JButton("Message");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MessageEx.this, "Message"); // 창이 띄워짐
			}
		});
		contentPane.add(Button1);
		
		JButton Button2 = new JButton("Confirm");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 대화상자 다이얼로그
				int result = JOptionPane.showConfirmDialog(MessageEx.this, "Do you want to exit?", "EXIT", JOptionPane.YES_OPTION);
				//                                        ( 출력화면, 메시지, 타이틀,)
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		contentPane.add(Button2);
		
		JButton Button3 = new JButton("Input");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(MessageEx.this, "Input name"); // (출력화면, 메시지)
				JOptionPane.showMessageDialog(MessageEx.this, "Welcome " + name);
			}
		});
		contentPane.add(Button3);
		
		JButton Button4 = new JButton("Option");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자 정의 버튼
				String[] str = { "ADD", "UPDATE", "DELETE" }; // 자료형[] => 배열참조자료형
				JOptionPane.showOptionDialog(MessageEx.this, "SELECT MENU", "OPTION", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
				//                         	( 출력화면		   , 메시지         , 타이틀	, 아이콘 종류
			}
		});
		contentPane.add(Button4);
	}

}
