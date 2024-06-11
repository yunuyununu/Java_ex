package ch11;
// 추상클래스
// 1개 이상의 abstract method
public abstract class AbstractClass {
	abstract void method1(); // 완성되지 않은 함수 - ;대신 body({})가 필요
	
	void method2() {
		System.out.println("완성된 method");
	}

}