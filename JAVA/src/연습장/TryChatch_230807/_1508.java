package 연습장.TryChatch_230807;

import java.util.Scanner;

public class _1508 {

	/*
	 * 순서도
	 * 1. 정수를 입력받는다.
	 * 2. N행 N열의 2차원 배열을 생성한다.
	 * 3. N번 반복하여, N개의 정수를 배열 1열에 순서대로 값을 대입한다.
	 * 4. 배열을 아래의 반복변수 i, j로 반복하여
	 * 		i : 1~N-1
	 * 		j : 1~j
	 * 		arr[i][j] = arr[i][j-1] - arr[i-1][j-1]
	 * 		수식으로 연산하여, ? (빈칸)에 값을 대입한다.
	 * 5. 배열을 반복하여, 값이 있는 삼각형의 모양의 부분만 출력한다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < j; j2++) {
				System.out.println(arr[j][j2] + " ");
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}
}
