package 연습장.TryChatch_230807;

import java.util.Scanner;

public class CodeUp_1508 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = 4;
//		int m = sc.nextInt(); // 열이 한칸씩 커지도록
//		for (int i = 0; i < m; i++) {
//			int[][] arr = new int[n][i];
//		}
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   // 4
		for (int i = 0; i < N; i++) {
			int[][] arr = new int[N][];
			for (int j = 0; j < i+1; j++) {
				arr[i] = new int[j];
			}
		}
		sc.close();
		
		
		System.out.println();
		
	}
}
