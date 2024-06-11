package ch07;

public class Person2 {
	private String name;
	// property 프로퍼티(속성)
	// field , member
	// 전역변수 - 클래스 전체에서 사용 가능
	private int age;
	// setter 변수에 값 저장
	//  - 외부에서 메소드를 통해 데이터에 접근하도록 유도
	// getter 변수에 저장된 값 읽음
	//  - 외부에서 객체의 데이터를 읽을 때 사용
	// set + 변수명 = setAge
	private double height;
	
	/* getter
	접근제한자 : public
	리턴타입 : 필드의 리턴타입
	리턴값 : 필드값
	*/
	/* setter
	접근제한자 : public
	리턴타입 : void
	리턴값 : 필드 타입
	*/
	
	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public void setAge(int age) {
		if ( age < 0 || age > 150 ) {
			System.out.println("Age error!");
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
		// this - 현재 인스티스(객체)의 시작주소
		// 로컬변수(지역변수)
		// - 함수 호출 생성, 함수 종료 소멸
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("Name: " + name + " , Age: " + age + " , Height: " + height);
	}
	

}
// 캡슐화 capsulation
// visible 오픈된 변수, 함수
// not visible 막혀있는 변수, 함수
