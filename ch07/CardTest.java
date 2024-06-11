package ch07;

public class CardTest {
	  public static void main(String args[]) {
          // 클래스변수(static 변수)는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다.
          System.out.println("Card.width = " + Card.width);
          System.out.println("Card.height = " + Card.height);

          Card c1 = new Card(); // 인스턴스 생성
          c1.kind = "Heart";
          c1.number = 7;

          Card c2 = new Card(); // 인스턴스 생성
          c2.kind = "Spade";
          c2.number = 4;

          System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
          System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );             
          System.out.println("이제 c1의 width와 height를 각각 50, 80으로 변경합니다.");
          c1.width = 50; // 인스턴스 생성 안해도 호출가능
          c1.height = 80; // 인스턴스 생성 안해도 호출가능

          System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
          System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
    }

}
