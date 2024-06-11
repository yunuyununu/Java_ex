package ch17;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginEx extends JFrame { // 확장, 상속

	private static final long serialVersionUID = 1L;
	// 버전코드
	// 필드변수, 프로퍼티변수
	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	Map<String, String> map;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEx frame = new LoginEx();
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
	public LoginEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); // 프레임의 좌표, 사이즈
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		// 기본레이아웃 안 쓰겠다=> 절대좌표
		
		userid = new JTextField();
		userid.setBounds(113, 42, 116, 21);
		// 텍스트필드 프레임의 좌표, 사이즈
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(113, 89, 116, 21);
		contentPane.add(pwd);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				//						  (값)=>
				String pw = String.valueOf(pwd.getPassword());
				// 		     			  (문자배열)=>문자배열을 스트링으로
				if (map.get(id) == null) {
					lblResult.setForeground(Color.red);
					lblResult.setText("ID is incorrect.");
				} else {
					if(map.get(id).equals(pw)) {
					// if(map.get(id).equals(pw)
						lblResult.setForeground(Color.blue);
						lblResult.setText("Welcome " + id);
					} else {
						lblResult.setForeground(Color.red);
						lblResult.setText("ID or Password is incorrect.");
					}
				}
			}
		});
		btnLogin.setBounds(112, 137, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(113, 185, 180, 15);
		contentPane.add(lblResult);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(39, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(39, 207, 32, 0);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호");
		lblNewLabel_3.setBounds(39, 92, 57, 15);
		contentPane.add(lblNewLabel_3);
	}
}
