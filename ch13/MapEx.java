package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		//  key자료형, value자료형
		// list 순서대로, 인덱스 0부터
		map.put("apple", "사과");
		//      key     value
		System.out.println(map.get("apple"));
		map.put("grape", "포도");
		map.put("peach", "배");
		System.out.println(map);
		String input = "grape";
		System.out.println(input + "==>" + map.get(input));
		
		System.out.println(map.keySet()); // map의 key 집합
		System.out.println(map.values()); // map의 value 집합
		
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {  // 다음자료가 있으면 true, 없으면 false
			String key = iterator.next();  // 다음자료를 꺼냄
			System.out.println("key=" + key);
			System.out.println(",value=" + map.get(key));
		}
	}
}