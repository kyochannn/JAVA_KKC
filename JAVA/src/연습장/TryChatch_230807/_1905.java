package 연습장.TryChatch_230807;

import java.util.Scanner;

public class _1905 {

	// 1~10까지 합계를 구해서 반환
	public static int method(int N) {
		// 뒤에서부터 더하거나
		// 앞어서부터 더하거나 v
		
		// 종료조건
		if ( N == 0) return 0;
		
		// 재귀호출
		return N + method(N-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = method();
		System.out.println();
	}
	
}
// x의 값이 점점 늘어가거나 줄어든다.
// f(x) = x + f(x-1)
// 재귀함수를 수학적으로 표현한 것
