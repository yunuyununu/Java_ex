package ch12;

public class StringMethod {
	public static void main(String[] args) {
		String str = "java";
		str += " programming"; // = "java programming"
		System.out.println(str.length()); // "java programming"의 글자수
		System.out.println(str.charAt(2)); // 2번째 오는 글자 = v
		System.out.println(str.indexOf("program")); // 몇번째오는 문자인지 = 5
		System.out.println(str.indexOf("z")); // 내용이 없으면 -1
		System.out.println(str.substring(0,4)); // 부분적인 문자열(시작,끝)/끝 앞까지 출력 =java
		System.out.println(str.substring(5)); // 시작만 있으면 5에서 끝까지 =programming
		System.out.println(str.replace("java", "jsp")); // (원래값,바꿀값) =jsp programming /원본은 바뀌지않음
		System.out.println(str); // 원본그대로 나옴
		str = str.replace("java", "jsp"); // 원본이 바뀜
		System.out.println(str); // 바뀐값이 나옴
	}

}
