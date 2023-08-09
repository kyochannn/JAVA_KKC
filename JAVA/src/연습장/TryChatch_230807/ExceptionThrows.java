package 연습장.TryChatch_230807;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			input();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("정수를 입력해주세요.");
		}
	}
	public static void input() throws InputMismatchException {
		System.out.println("input : ");
		int input = sc.nextInt();
		System.out.println(input);
	}
	
}
