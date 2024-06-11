package ch12;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		String str = "kim,20,180,65,Seoul,Student"; // ,로 구분되어있음 / token 토큰
		String[] items = str.split(","); // 구분자=, / items==> kim 20 180 65 Seoul Student
		for (String s : items) {
			System.out.println(s);
		}
		StringTokenizer st = new StringTokenizer(str, ","); // 문자열을 토큰화시키는 것(문자를 세부적으로 나누는것)
		int cnt = st.countTokens();
		System.out.println("Tokens:" + cnt);
		while (st.hasMoreElements()) { // while(조건) 조건이 true면 계속 돌아간다
			System.out.println(st.nextToken()); // 자료가 없을때까지 계속 찍는다
		}
	}
}
