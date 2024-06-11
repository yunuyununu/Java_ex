package ch13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>(); // 상위 하위 - 다형성
		//Set<String> hs = new TreeSet<>(); // TreeSet은 오름차순으로 정리가 됨
		hs.add("apple"); // 추가
		hs.add("peach");
		hs.add("melon");
		hs.add("grape"); 
		hs.add("melon");  // 중복값은 입력되지 않음
		System.out.println(hs);  // 순서대로 저장되지 않음
		for (String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {  // 다음 자료가 있으면 next
			System.out.println(it.next());
		}
	}
}