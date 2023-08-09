package 연습장;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	public static void main(String[] args) {
		
		try {
			input(); // 만약에 이게 에러가 나는 문장이야. 그런데 이걸 던지고 싶어.			
		} catch (Exception e) {
			e.printStackTrace();  // 어떤 오류가 나는지 콘솔창에 오류 메시지를 알려준다.
			System.out.println("정확한 자료형으로 넣어주세요.");
		}
		
	}
	public static void i-nput() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		int input = sc.nextInt();
		System.out.println(input);
	}
}
