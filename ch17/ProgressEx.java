package ch17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JProgressBar progress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressEx frame = new ProgressEx();
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
	public ProgressEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JProgressBar progress = new JProgressBar();
		contentPane.add(progress);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
		// 버튼.add액션Listener(처리)
			public void actionPerformed(ActionEvent e) {
				Thread th = new Thread(new Runnable() {
					//   			  (스레드객체)
					@Override
					public void run() {
						for (int i = 1; i <= 100; i++) {
							progress.setValue(i);
							// 프로그레스바.setValue(값)
							try {
								Thread.sleep(100); // cpu실행 멈춤 ms
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						JOptionPane.showMessageDialog(ProgressEx.this, "Done");
						// 		  보여주기 메세지 다이얼로그 (화면, 메시지)
					}
				});
				th.start();
			}
		});
		contentPane.add(btnStart);
	}

}
