package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ComboEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox cboTable;
	private JTextArea ta; // 필드변수로 이동
	/*
	 new ComboEx();
	 1 => new ComboEx   인스턴스 생성
	 2 => ComboEx()     생성자 호출
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboEx frame = new ComboEx();
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
	public ComboEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		cboTable = new JComboBox();
		// 콤보박스.추가 아이템이벤트 감지기능(처리기능)
		cboTable.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) { // ItemEvent e 정보전달
				if (e.getStateChange() == ItemEvent.SELECTED) {
					// 가져오기 상태 바뀐   같다  선택상태
					ta.setText(""); // 기존 텍스트 지우기
					int table = cboTable.getSelectedIndex() + 2;
					//                   가져오기 선택된 인덱스
					for (int i = 1; i <= 9; i++) {
						ta.append(String.format("%2d x %2d = %2d\n", table, i, table * i));
						// 끝에 추가
						// setText() 교체
					}
				}
			}
		});
		
		cboTable.setModel(new DefaultComboBoxModel(new String[] {"2단","3단","4단","5단","6단","7단","8단","9단"}));
		contentPane.add(cboTable, BorderLayout.NORTH);
		
		ta = new JTextArea();
		contentPane.add(ta, BorderLayout.CENTER);
	}

}
