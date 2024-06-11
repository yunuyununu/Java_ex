package ch08;

public class Calculator {
	// 변수 private
	// 함수 public
	// 캡슐화
	private int left; // 외부 사용 금지
	private int right;
	
	// 생성자 constructor
	// new 클래스이름() => 생성자 호출
	public Calculator() { // 리턴타입 없음 // 생성자에는 void X
		System.out.println("생성자 호출..."); // new 자동실행
	}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int getLeft() { // 변수 읽을 수 있는 함수
		return left;
	}

	public void setLeft(int left) { // 변수 값 쓸 수 있는 함수 (로컬지역변수)
		this.left = left;
		// this - 현재 객체의 주소값
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left + right) / 2);
	}

}
