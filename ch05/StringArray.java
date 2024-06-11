package ch05;

public class StringArray {   // public, private, default
	public static void main(String[] args) {
		String[] str = { "Java", "JSP", "DB", "Python" };
		for (int i = 0; i < str.length; i++) { // str.length = 4
			System.out.println(str[i]);
		}
	}
}