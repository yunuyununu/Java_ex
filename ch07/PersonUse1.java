package ch07;

public class PersonUse1 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.name = "Kim";
		p1.age = 200;
		// p1.age = 200;
		p1.height = 180.5;
		System.out.println("Name: " + p1.name);
		System.out.println("Age: " + p1.age);
		System.out.println("Height: " + p1.height);
	}
}
// 자료형 변수 , 기본자료형 , 참조자료형(클래스)
/*
	[ 출력 ]
	Name: Kim
	Age: 200
	Height: 180.5
*/
