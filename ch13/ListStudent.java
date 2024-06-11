package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>(); // 자료형 지정 , 뒤 생략가능
		list.add(new Student("Kim", "Design", 1));
		list.add(new Student("Park", "DB", 2));
		list.add(new Student("Song", "Math", 3));
		System.out.println("Name\tMajor\tYear");
		
		for (Student s : list) { 
			System.out.println(s.getName() + "\t" + s.getMajor() + "\t" + s.getYear());
		}
		// 위 아래 같은 출력
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i); // list.get(인덱스) 0부터 => 배열과 똑같음
			System.out.println(s.getName() + "\t" + s.getMajor() + "\t" + s.getYear());
		}

	}

}