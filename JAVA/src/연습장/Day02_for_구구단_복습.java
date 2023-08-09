package 연습장;

import java.util.Iterator;
import java.util.Scanner;

public class Day02_for_구구단_복습 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		System.out.println("입력받은 값은 " + input + "입니다");
		System.out.println("다음 단까지 출력합니다." + "\n");
		
		for (int i = 1 ; i <= input ; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9 ; j++) {
				System.out.println(i +"*" + j  +"=" + i * j);
			}
			System.out.println();
			}
		
	
		System.out.println("input? ");
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		
		for (int i=1;i<=input;i++ ) {
			for (int j = 1; j<=i ;j++ ) {
				System.out.println("*" * j);
				System.out.println(j);
			}
		}

	
	
	
	
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요");
//		int num = sc.nextInt();
//		for(int i =1; i<=num;i++) {
//			for(int j =1; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
////		위 아래 구분. 상승별, 하강별
//		for(int i=1; i<=num-1;i++) {
//			for(int j = num-1;j>=i;j--) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
	}
}

