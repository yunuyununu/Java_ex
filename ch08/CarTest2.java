package ch08;

class Car2 {
    String color;             // 색상
    String gearType;      // 변속기 종류 - auto(자동), manual(수동)
    int door;                   // 문의 개수

    Car2() {
          this("white", "auto", 4);    
          // Car(String color, String gearType, int door)를 호출
    }

    Car2(String color) {
          this(color, "auto", 4); // blue가 들어감
    }

    Car2(String color, String gearType, int door) {
    	// 생성자간의 호출에는 this를 사용.
          this.color = color;
          this.gearType = gearType;
          this.door = door;
    }
}


public class CarTest2 {
	 public static void main(String[] args) {
         Car2 c1 = new Car2();      
         Car2 c2 = new Car2("blue");

         System.out.println("c1의 color=" + c1.color + ", gearType=" +c1.gearType+ ", door="+c1.door);
         System.out.println("c2의 color=" + c2.color + ", gearType=" +c2.gearType+ ", door="+c2.door);
   }

}
