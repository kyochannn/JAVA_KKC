package Day_02;

import java.util.Iterator;

public class Ex17_for {

	public static void main(String[] args) {
		// for(1.초기식 ; 2.조건식 ; 4.증감식) {3. 실행문}
		//실행순서 : 1 > 반복 (2>#>4)
		
		//1. 1~10까지의 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//2. 50~100까지의 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//3. 1~20까지의 정수 중에 짝수만 출력
		for (int i = 1 ; i <= 20 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//4. 1~20까지의 정수 중에 홀수만 출력
		for (int i = 1 ; i <= 20 ; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
//		for (int i = 2 ; i <= 20 ; i += 2) {
//				System.out.println(i);
//			}
//		} 
		
	}
}
