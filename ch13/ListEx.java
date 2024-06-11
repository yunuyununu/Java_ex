package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>(); // 좌변이 상위  // 우변 괄호 안 빈칸가능
		// ArrayList<>() -> 기본값 10 , 지정하면(100) 그 수로 늘어남
		list.add("one"); // 추가
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4); // index 3 자리에 value 4 끼어넣기
		list.remove(0); // 인덱스 0 제거 => "one"이 제거됨
		for (int i = 0; i < list.size(); i++) {  //list.size() 데이터개수
			System.out.print(list.get(i) + "\t");
		}
	
	}
	
}
