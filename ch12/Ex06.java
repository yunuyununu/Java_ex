package ch12;

public class Ex06 {
	 public static void main(String[] args) {
	      String a="hello";
	      String b="hello";
	      System.out.println(a==b); // equal
	      
	      String a1=new String("hello");
	      String b1=new String("hello");
	      System.out.println(a1==b1); // false, 주소 비교
	      System.out.println(a1.equals(b1));
	   }

}
