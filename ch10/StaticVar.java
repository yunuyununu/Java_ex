package ch10;

public class StaticVar {
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) {  // static 붙여야함
		System.out.println(a);
		// System.out.println(b);
		// static이 안 붙으면 에러 남. 메모리에 안 올려져 있기 때문
		StaticVar s = new StaticVar(); // 이렇게 메모리에 올려줘야
		// static이 안 붙은 것은 new를 해주어야함
		System.out.println(s.b); // b가 실행이 됨
	}
}