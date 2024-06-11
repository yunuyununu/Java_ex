package ch11;

public class AbstractExtends extends AbstractClass {
	// 확장,상속

	@Override // 함수재정의
	void method1() { // 앞에것을 완성시킨것
		System.out.println("추상 method를 완성한 method");
	}
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
