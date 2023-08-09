package 연습장.TryChatch_230807;

import java.util.Scanner;

public class Recursive_1904 {

	public static void method(int n, int m) {

		if (m == n-1) {
			return;
		}
		method(n, m-1);
		
	
		
		if(m % 2 == 1) {
			System.out.print(m + " ");
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("첫 번째 수와 두 번째 정수 사이의 모든 홀수를 출력하는 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int n = sc.nextInt();
		System.out.print("첫 번째 정수보다 큰 작은 정수를 하나를 더 입력하시오 : ");
		int m = sc.nextInt();
		method(n, m); 
		sc.close();
	}
}
