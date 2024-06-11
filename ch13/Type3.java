package ch13;

public class Type3<T> { 
	// 모든자료형 가능. 비용 절약 
	// <T> - 자료형미정
	T t;

	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		Type3<Object> ts = new Type3<Object>();
		ts.setT("안녕"); // 모든 자료형 가능
		System.out.println(ts.getT());
		Type3<String> t = new Type3<String>(); // 사용할 자료형 넣어주기
		t.setT("100");
		System.out.println(t.getT());
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
	}

}
