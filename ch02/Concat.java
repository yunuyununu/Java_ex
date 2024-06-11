package ch02;

public class Concat {
	public static void main(String[] args) {
		String a = "Hello " + "java";
		System.out.println(a);
		String b = "point: " + 100; // 더하기는 가능
		System.out.println(b);
		String c = "95";
		System.out.println(Integer.parseInt(c)*100); // 95*100=9500
		//                 정수클래스 뽑아내다 정수를
		// 문자열 95를 곱해주려면 변환필요
		
		int d = 35;
		System.out.println(d*10);
		
	}

}
