package ch12;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java"; // 상수 , 스트링 불변
		System.out.println(str);
		System.out.println(str.toUpperCase()); // 대상 문자열을 모두 대문자로
		System.out.println(str.toLowerCase()); // 대상 문자열을 모두 소문자로
		System.out.println(str); // 내용이 바뀌는건 아님
		str = str.toLowerCase(); // 주소값을 바꿔줌
		System.out.println(str); // 바꾼값이 나옴
		
		str = ""; // 빈 문자열
		System.out.println(str);
		str = null; // 가리키는게 없음
		System.out.println(str);
		
		char ch ='\0'; // 빈 문자열
		System.out.println(ch + ",code:" + (int)ch); // null은 0
		ch = ' ';
		System.out.println(ch + ",code:" + (int)ch); // 스페이스는 32
	}

}