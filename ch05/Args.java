package ch05;
// main(String[] args) 사용
public class Args {
	public static void main(String[] args) {
		System.out.println("명령행 매개변수 개수: " + args.length);
		for ( int i = 0; i< args.length; i++) {
			System.out.println(args[i]);
		}
	}
}