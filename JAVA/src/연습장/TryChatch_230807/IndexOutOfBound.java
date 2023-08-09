package 연습장.TryChatch_230807;

import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 요소의 개수 : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		System.out.println("접근할 index : ");
		int index = sc.nextInt();
		System.out.println("입력할 값 : ");
		int input = sc.nextInt();
		
		// java.lang.ArrayIndexOutOfBoundsException 에러가 발생했다.
		try {
			arr[index] = input;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("알맞지 않은 인텍스에 배열을 초과했습니다.");
		}
		sc.close();
		
	}
}
