package ch09;

public class Area {
	private int width;
	private int length;
	
	public Area() {
	}
	
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length; // 10X20
	}
	
	
	
}