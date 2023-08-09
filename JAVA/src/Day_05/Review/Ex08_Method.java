package Day_05.Review;

import java.util.Scanner;

public class Ex08_Method {
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int minus(int a, int b) {
		int result = a - b;
			// return (값);
			// 1. (값)을 메소드 호출한 자치조 반환
			// 2. 메소드 종료
			// 3. 메모리 헤제
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		
		System.out.println(plus(a, b));
		System.out.println(minus(a, b));
		sc.close();
	}
}
