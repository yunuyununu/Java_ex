package ch14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
	public static void main(String[] args) {
		int num = 50;
		Scanner sc = null;
		try {
			System.out.print("Number:");
			sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println(num / value);
		} catch (NullPointerException e) {  // 참조변수, 내용x
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {  // 산술연산 분모 0
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {  // 자료형 불일치
			System.out.println("InputMismatchException");
		} catch (Exception e) {  // 기타 예외
			System.out.println("Other Exception");
		} finally {    // 항상실행
			if (sc != null)
				sc.close();  // 메모리정리
		}
		System.out.println("end");
	}

}