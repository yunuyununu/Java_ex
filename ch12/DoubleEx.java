package ch12;

public class DoubleEx {
	public static void main(String[] args) {
		Double num1 = 11.5; // 첫글자대문자 = 클래스
		double num2 = 3.5; // 
		double num3 = num1/num2;
		System.out.println(num3); // 11.5/3.5=3.285~
		String str = "11.5";
		System.out.println(str + 200); // 그냥연결 , 숫자x // 11.5 + 200 = 11.5200
		System.out.println(Double.parseDouble(str) + 200); // 실수를 추출(숫자) 11.5 + 200 = 211.5
	}

}
