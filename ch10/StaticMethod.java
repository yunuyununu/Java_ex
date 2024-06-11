package ch10;

public class StaticMethod {
	static int a = 10; // 메모리에 저장됨
	int b = 20;
	
	public static void printA() {
		System.out.println(a);
		// System.out.println(b); // new를 안하면 쓸 수 없음
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);
	}
	
	public void printB() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		printA(); // 메모리에 올라가 있기 때문에 출력가능
		StaticMethod a = new StaticMethod();
		a.printB(); 
	}
}

// static => 프로그램 시작하면 자동으로 올라감
// non-static => new 하기 전에는 없음, new해야 올라감