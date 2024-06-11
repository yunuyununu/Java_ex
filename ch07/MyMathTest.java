package ch07;
// 사칙연산 4가지
class MyMathTest {
	 public static void main(String args[]) {
         MyMath mm = new MyMath();
         long result1 = mm.add(5L, 3L);
         long result2 = mm.subtract(5L, 3L);
         long result3 = mm.multiply(5L, 3L);
         double result4 = mm.divide(5L, 3L);             
         // double대신 long값을 입력했다.
         
         System.out.println("add(5L, 3L) = " + result1);
         System.out.println("subtract(5L, 3L) = " + result2);
         System.out.println("multiply(5L, 3L) = " + result3);
         System.out.println("divide(5L, 3L) = " + Math.round(result4*100)/100.0);
   }
}