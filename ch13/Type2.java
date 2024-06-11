package ch13;

public class Type2 {
	Object value; // 모든자료형 가능. 벗 고비용.
	// 프로퍼티(속성)

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	// static 정적 : 프로그램 시작~끝
	public static void main(String[] args) {
		Type2 t = new Type2();
		//참조변수 = new 클래스()=> 인스턴스, 객체
		t.setValue(100);
		System.out.println(t.getValue());
		t.setValue("kim");
		System.out.println(t.getValue());
		t.setValue(100.5);
		System.out.println(t.getValue());
	}

}