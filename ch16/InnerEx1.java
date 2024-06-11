package ch16;

public class InnerEx1 {
	static int x = 10;
	// static 곧바로 사용가능
	
	class Inner { // 내부클래스, 독립클래스x
		int getX() { // new하고 사용가능
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);  // 10
		InnerEx1 e = new InnerEx1();
		InnerEx1.Inner in = e.new Inner();
		//외부클래스.내부클래스 참조변수
		System.out.println(in.getX());  // 10
	}
}
/* assemble  조립
  소스코드=>바이트코드
  컴파일
   disassemble  해체
  바이트코드=>소스코드
*/