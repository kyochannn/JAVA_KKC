package 연습장.TryChatch_230807;

import java.util.Scanner;

public class Recursive_1901 {

	public static void method(int n) {

		if (n == 0) {
			return;
		}
		method(n-1);
			System.out.println(n);
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int n = sc.nextInt();
		method(n); // 만약 인자가 5라면,
		sc.close();
	}
}
