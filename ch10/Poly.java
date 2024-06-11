package ch10;

class A {
	int n = 10;
	
	public void print() {
		System.out.println(n);
	}
}

class B extends A {
	int n = 20;
	
	@Override
	public void print() {
		System.out.println(n);
	}
}

public class Poly {
	public static void main(String[] args) {
		B b = new B();
		// 자료형 변수 = new 자료형();
		// b ===> n 20
		b.print(); // B = 20
		A a = new B();
		// B b = new A(); => X
		// 상위   하위   -> 이런 형태여야 함
		System.out.println(a.n);
		a.print();
	}
}