package ch07;

public class Student {
	private String name;
	private double point;
	private int tuition;
	private int scholarship;
	public void input(String name, double point, int tuition ) {
		// this.변수 ==> 프로퍼티 변수
		this.name = name;
		this.point = point;
		this.tuition = tuition;
		if (point >= 4.3) {
			scholarship = tuition;
		} else if (point >= 4.0) {
			scholarship = 2500000;
		} else if (point >= 3.5) {
			scholarship = 1000000;
		}
	}
	@Override
	public String toString() {
		String str = "Name: " + name + "\n";
        str += "Point: " + point + "\n";
        str += "Tuition: " + tuition + "\n";
        str += "Scholarship: " + scholarship + "\n";
        return str;
	} // 내용을 바꿨다

}
