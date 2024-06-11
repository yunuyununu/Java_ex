package ch07;

public class PointUse {
	public static void main(String[] args) {
		
		// Point p1; => 가리키는값이 없음. null
		Point p1 = new Point(); // new 생성
		// 클래스이름 참조변수;
		// 참조변수=new 클래스이름();
		// p1 => Point object
		// 참조변수    시작주소
		//           getName() setName()
		
		p1.setName("Kim");
		p1.setJava(90);
		p1.setDb(80);
		p1.setMath(89);
		p1.calc(); // 총점, 평균 출력
		p1.print(); // 정해놓은 출력값이 나옴
	}
}