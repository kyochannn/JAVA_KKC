package 연습장.TryChatch_230807;

import java.util.Scanner;

public class Recursive_1902 {

	public static void method(int n) {
		System.out.println(n);

		if (n == 1) {
			return;
		}
		method(n-1);
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int n = sc.nextInt();
		method(n);
		sc.close();
	}
}