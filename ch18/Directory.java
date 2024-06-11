package ch18;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Directory extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDirectory;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Directory frame = new Directory();
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
	public Directory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfDirectory = new JTextField();
		tfDirectory.setBounds(26, 48, 116, 21);
		contentPane.add(tfDirectory);
		tfDirectory.setColumns(10);
		
		JButton button1 = new JButton("OK");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String directory=tfDirectory.getText();
				 File file=new File(directory);
				 String[] list=file.list();
				 ta.setText("");
				 for(int i=0; i<list.length; i++){
					 File f=new File(directory,list[i]);
					 String str=f.isDirectory()?"Directory" : "File";
					 ta.append(str+":"+list[i]+"\n");
	                }
			}
		});
		button1.setBounds(180, 47, 97, 23);
		contentPane.add(button1);
		
		ta = new JTextArea();
		ta.setBounds(26, 79, 251, 146);
		contentPane.add(ta);
	}

}
