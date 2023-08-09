package 연습장.TryChatch_230807;

public class Recursive {

	public static void method(int n) {
		// 종료 조건
		if ( n == 0 )
			return;
			
		method(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		method(5);
	}
}
