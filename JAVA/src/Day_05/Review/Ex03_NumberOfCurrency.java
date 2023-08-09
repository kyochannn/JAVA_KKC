package Day_05.Review;

import java.util.Scanner;

/*
 * 화폐 매수 구하기
 * 
 * 금액 : 537620원
 * 
 * 50000 : 10(개)
 * 10000 : 3
 * 5000  : 1
 * 1000  : 2
 * 500   : 1
 * 100   : 1
 * 50    : 0
 * 10    : 2
 * 5     : 0
 * 1     : 0
 * 
 * 위과 같이 금액을 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 
 * 출력하는 프로그램을 만드시오.
 */

public class Ex03_NumberOfCurrency {
/*
 * (순서도)
 * 	1. 값을 입력 받는다.
 * 	2. 금액을 큰 단위별로 나누어준다.
 * 		1. (예를들어) 56800원이 들어오면 가장 큰 화폐 단위인 50000로 나누어준다.
 * 		2. 56800 % 50000 > 6800
 * 			1. 6800 % 10000 > x 
 * `		2. 6800 % 5000 > 1800
 * 			3. 1800 % 1000 > 800
 * 			4. 800 % 500 > 300 (3개)
 * 			5. 100 % 100 > 0
 */
	public static void main(String[] args) {
		
		int a; // 개 			> 변수를 선언할 알기 쉽게 해주면 다음에 더 좋을 것 같다.
		int b = 0; // 남은 돈
		
			System.out.print("얼마 있니 : ");
			Scanner sc = new Scanner(System.in);
			
		int money = sc.nextInt();
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		// 같은 것을 찾고 어떻게 반복문으로 만들지에서 막힘. 해결
		for (int z : arr) {
			if (money >= z) {
				a = money / z; // 개
				System.out.println(z + "원 :\t" + a + "개");
				b = money % z; // 남은 돈
				System.out.println("돈 :\t" + b + "개");
				money = b;
			}
		}
		sc.close();
	}
}
// 만들긴 했는데 정리가 ... 좀 더럽다,,,