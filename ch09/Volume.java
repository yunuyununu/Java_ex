package ch09;

public class Volume extends Area{
	//        현재    확장(상속)  상위클래스
	// class 하위클래스 extends 상위클래스 super class
	//       subclass
	private int height;
	
	public Volume() {
	}
	//                 10          20          30
	public Volume(int width, int length, int height) {
		super(width, length);
		//상위클래스의 생성자
		this.height = height;
		//다른생성자
	}
	
	public int getVolume() {
		return getArea() * height; // 200X30
	}
}