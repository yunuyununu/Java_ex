package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockExam extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Calendar cal;
	private String str;
	private JLabel lblTime; //필드변수로 이동



	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // 내부클래스
		// 그래픽처리를 위한 백그라운드 스레드 추가
			public void run() {
				try { // 시도
					ClockExam frame = new ClockExam();
					frame.setVisible(true);
					// 화면에 표시
				} catch (Exception e) { // 예외발생처리
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClockExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 설정 기본 닫기 동작
		setBounds(100, 100, 450, 300); // 범위지정
		contentPane = new JPanel();
		// 컴포넌트 - 버튼,레이블
		// 컨테이너 - 패널, 프레임
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// 테두리 설정
		contentPane.setLayout(new BorderLayout(0, 0));
		// 레이아웃 설정
		//     BorderLayOut - 5가지 영역
		//     FlowLayout - 순서대로
		setContentPane(contentPane);
		// 컨텐트팬을 컨텐트팬으로 설정
		
		
		lblTime = new JLabel("New label"); // 생성자 속 로컬변수
		// 레이블 생성          (텍스트)
		lblTime.setFont(new Font("굴림", Font.BOLD, 20));
		// 폰트설정                (폰트이름, 스타일, 폰트사이즈)
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);// 가로정렬방식
		contentPane.add(lblTime, BorderLayout.CENTER);
		// 패널     추가  (레이블   , 가운데)
		// 대상.add(컴포넌트, 위치)
		Thread t = new Thread(this); // 시간처리를 위한 스레드 생성
		t.start(); // 시작요청 => run() 실행
		
		JButton btnExit = new JButton("Exit"); // 버튼생성
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		// 이벤트소스.리스너(핸들러)
		// 버튼.액션리스너(동작)
		
		contentPane.add(btnExit, BorderLayout.SOUTH);
		// 패널에 추가     (버튼  , 위치)
	}

	@Override
	public void run() {
		while (true) { // 무한반복
			cal = Calendar.getInstance();
			// 캘린더 인스턴스 생성
			str = String.format("%02d:%02d:%02d", cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
			// String.format("형식", 값들)
			lblTime.setText(str);
			//레이블.setText(값)
			try {
				Thread.sleep(1000); // cpu 실행 강제로 멈춤
			} catch (InterruptedException e) { // cpu간섭
				e.printStackTrace();
			}
		}
		
	}

}
