package ch14;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int a = 10 , b = 0, c;
		c = a / b;
		System.out.println(c); 
		System.out.println("end");
		// 예외발생 - 산술연산관련 예외 / 0으로 나눔
	}

}