package ch12;

public class ObjectCast {
	public static void main(String[] args) {
		int a = 10; // 정수형 a=대입
		Object obj = 20; // 모든자료형 처리가능
		a = (int) obj;
		System.out.println(a); // 20
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		// 배열은 같은 구성으로 이루어져야함
		// Object는 가능 (거의 쓰지않음)
		for (Object o : obj2) { // for each (잘 안씀)
			System.out.println(o);
		}
	}

}
