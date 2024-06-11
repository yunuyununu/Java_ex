package ch12;

public class StringBuilerEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder(); // 16글자 저장
		str1.append("java"); // append 끝에 추가 / 공간확보 -> 글자주입
		str1.append(" programming");
		String str2 = str1.toString(); // 좌(스트링) = 우(스트링빌더) .toString()으로 바꿔주어야함.
		System.out.println(str2);
	}

}
