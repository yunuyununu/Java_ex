package ch14;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {  // 시도(실행구)
			c = a / b;  // 예외발생
			System.out.println(c);
		} catch (Exception e) {  // 예외발생시 처리하는 부분
			e.printStackTrace(); // 출력스택구조 // 에러의 발생근원지부터 단계별로 출력
		}
		System.out.println("end");
	}

}
// 문제가 발생해도 끝까지 처리함.