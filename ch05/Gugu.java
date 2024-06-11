package ch05;

public class Gugu {
	   public static void main(String[] args) {
		   if(args.length==0) {
			   System.out.println("사용방법: Gugu 숫자");
			   System.exit(0);
		   }
		   int dan=Integer.parseInt(args[0]); // Run Configuration - Arguments 변경
	      for(int i=1; i<=9; i++) {
	         System.out.println(dan+"x"+i+"="+dan*i);
	      }
	   }
	}