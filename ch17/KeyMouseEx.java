package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class KeyMouseEx extends JFrame implements KeyListener, MouseListener, MouseMotionListener {
	private int x, y;
	private int width, height; // 가로, 세로사이즈
	private Image img; // 이미지
	
	public KeyMouseEx() { // 생성자
		addKeyListener(this); // 프레임에 키이벤트 추가
		addMouseListener(this); // 마우스 이벤트
		addMouseMotionListener(this); // 마우스동작 - 드래그
		
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("tomato.png"));
		// getClass() : 현재 실행중 클래스
		setFocusable(true); // 포커스 받을 수 있게 설정
		requestFocus(); // 커서 입력 가능 상태
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) { // 그래픽 처리
		super.paint(g);
		width = img.getWidth(this); // 이미지 가로사이즈
		height = img.getHeight(this); // 이미지 세로사이즈
		g.drawImage(img, x, y,this);
	}
	
	public void keyTyped(KeyEvent e) { // 키입력 = 누르고 떼는
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(50,  y - 5);
			break;
		case KeyEvent.VK_DOWN:
			y = Math.min(480 - height, y + 5);
			break;
		case KeyEvent.VK_LEFT:
			x = Math.max(20,  x - 5);
			break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(480 - width, x + 5);
			break;
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) { // 클릭 누르고떼는
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) { // 나갈때
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint(); // 그래픽 새로 그려달라
	}
	public static void main(String[] args) {
		new KeyMouseEx();
	}
	

}
