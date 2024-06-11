package ch13;

public class Type1 {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	 public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100); // 정수형
		//t.setValue(100.5); // 실수형
		// t.setValue("hello"); // 문자형
		System.out.println(t.getValue());
	}

}