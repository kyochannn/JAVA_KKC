package Day_02;

import java.util.Scanner;

public class Ex12_switchbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// 입력 받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않다면 "**" 출력
		// - switch문을 사용하여 작성하시오.
		
		int r = num % 5;
				
		switch (r) {
		case 0:
			System.out.println("*");
			break;
		case 1:
			System.out.println("*");
			break;
		default:
			System.out.println("**");
			break;
		}
		
//		int r = num % 5;
//		
//		switch (r) {
//		case 0:
//		case 1:
//			System.out.println("*");      //break를 만나면 문장을 탈출한다.
//			break;
//		default:                          //default는 생략할 수 있다.
//			System.out.println("**");
//			break;
//		}
		
		
			
		// ******************************************************************
		// 학습자료 복습, 오늘 작성한 코드 다시 보면서 공부(복습), 책을 보면서 예제 따라해보기
		
		sc.close();
	}

}
