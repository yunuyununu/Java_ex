package ch10;

class T {
	private int num = 10;
	public final void print() {  // final 붙으면 오버라이딩 X
		System.out.println(num);  //10
	}

}

public class FinalMethod extends T {
	int num = 100;
	
//	@Override 오버라이드
//	public void print() {
//		System.out.println(num);
//	}
    // 위에 final을 빼고 실행하면 100이나옴
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		// f    Final
		
		f.print();
	}
}

// final 변수 => 값을 바꿀 수 없음
// final class
// final method 