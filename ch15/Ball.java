package ch15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

class MyFrame extends JFrame implements Runnable {  
	//        상속   윈도우창을 지원하는 프로그램 멀티스레드
	private int x, y = 50;  // 필드변수
	private int moveX = 2, moveY = 3;
	private Graphics bg; // 그래픽처리
	private Image offScreen;
	private Dimension dim; // 가로세로사이즈
	
	public MyFrame() {  // 생성자- 클래스이름 없음. 리턴값x. new로 생성
		setSize(500, 500); // 화면사이즈(500x500) - JFrame에 들어있음
		setResizable(false); // 화면 리사이즈 여부
		setVisible(true); // 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 세팅기본닫기동작(닫을때종료) - x로 프로그램닫기
		
		dim = getSize();// 화면사이즈 계산, 가로, 세로
		offScreen = createImage(dim.width, dim.height);
		//          이미지 생성(가로,세로)
		bg = offScreen.getGraphics();
		//   그래픽 처리 객체 생성
		Thread t = new Thread(this); // this 현재객체
		//   멀티 스레드 생성
		t.start(); // run() 실행
	}
	// 화면출력 준비
	@Override
	public void update(Graphics g) {
		bg.setColor(Color.orange); // 색상
		bg.fillRect(0,  0, getWidth(), getHeight());
		//         (기준좌표 , 가로길이, 세로길이)
		bg.setColor(Color.yellow);
		bg.fillOval(x, y, 30, 30); // 공크기
		//         (기준좌표, 가로, 세로)
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(offScreen, 0, 0, this);
		// 이미지 화면 출력 (이미지, 기준좌표, 이미지관찰자)
		update(g); // 출력준비
	}
	
	@Override
	public void run() {
		while (true) {
			if (x >(dim.width - 30) || x < 0) { // 가로길이
				moveX = -moveX; // 방향
			}
			x = x + moveX;
			if (y >(dim.width - 30) || y < 30) { // 세로길이
				moveY = -moveY;
			}
			y = y + moveY;
			repaint(); // 그래픽 새로 그려달라고 요청
			try {
				Thread.sleep(10); // cpu실행멈춤 10ms // 움직이는 시간조절
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ball {

	public static void main(String[] args) {
		new MyFrame();
	}

}
