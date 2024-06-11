package ch08;

public class Gugu {
   private int dan;
   
   public Gugu() {
   }
   
   public Gugu(int dan) { // 리턴타입 없음 // 생성자에는 void X
		this.dan = dan; // new 자동실행
	}
   
   public void setDan(int dan) {
      this.dan = dan;
   }
   
   public int getDan() {
      return dan;
   }
   
   public void print() {
      for (int i = 1; i <= 9; i++) {
         System.out.println(dan + "x" + i + "=" + dan * i);
      }
   }
   
   public static void main(String[] args) {
      Gugu g = new Gugu(7);
      // g.setDan(7);
      System.out.println("<" + g.dan + "단 구구단" + ">");
      g.print();
      
      Gugu g2=new Gugu(); //비어있는 생성자 필요
      g2.setDan(8);
      System.out.println("<" + g.dan + "단 구구단" + ">");

      g2.print();

   }
}