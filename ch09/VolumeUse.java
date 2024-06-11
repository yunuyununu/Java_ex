package ch09;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol1 = new Volume();
		// Area 생성 Volume 생성
		System.out.println("Volume:" + vol1.getVolume());
		
		Volume vol2 = new Volume(10, 20, 30);
		// vol2 참조변수   Volume 객체  <===  Area 객체
		System.out.println("Volume:" + vol2.getVolume());
	}
}