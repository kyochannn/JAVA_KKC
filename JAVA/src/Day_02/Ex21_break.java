package Day_02;

import java.util.Scanner;

public class Ex21_break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 무한 루프
		// : 반드시 종료 조건을 작성 해 주어야 한다. (break)
		
		while(true) {
			System.out.println("입력 : ");
			String str = sc.nextLine();
			
			
			// ** .equals  --> 문자열이 비교문자열과 일치하는 여부를 알려주는 메소드
			if (str.equals("STOP"))  
				break;
			
			System.out.println(">>" + str);
			
		}
		System.out.println("프로그램 종료");
		sc.close(); //  종료 조건이 생겨서 에러가 사라짐 
		
		
		
	}
}
