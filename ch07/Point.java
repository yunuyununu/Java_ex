package ch07;

public class Point {
	private String name;
	private int java;
	private int db;
	private int math;
	private int tot;
	private double avg;
	private String grade;
	
	// this. => 현재 클래스의 멤버를 가리키는 변수
	// naming 네이밍 rule
	// camal case 낙타식 표기법, 첫단어 소문
	// 파스칼 표기법 - SetName
	// snake 표기법 - set_name
	// 헝가리안 표기법 - 자료형_변수명 intAge; strName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void calc() {
		tot = java + db + math; // 총점
		avg = tot / 3.0; // 평균
		
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
	}
	
	public void print() {
		System.out.println("Name : " + name);
        System.out.println("Java  : " + java);
        System.out.println("DB  : " + db);
        System.out.println("Math  : " + math);
        System.out.println("Tot : " + tot);
        System.out.println("Avg : " + String.format("%.2f", avg));
        System.out.println("Grade : " + grade);
	}
}