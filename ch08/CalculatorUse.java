package ch08;

public class CalculatorUse {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// 클래스 참조변수  new 자료형 => 생성자 호출
		c1.setLeft(10); // 값을 줌
		c1.setRight(20);
		c1.sum();
		c1.avg();
		Calculator c2 = new Calculator(10, 20);
		c2.sum();
		c2.avg();
	}
}