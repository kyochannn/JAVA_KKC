package Day_02;

import java.util.Iterator;
import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 (1~9단)
		// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오
		// 입력 | 3
		// 출력이 된다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		
		int input = sc.nextInt();
				
				
		for (int i=1; i < 10 ; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result);
		}
		sc.close();
		
		
	}

}
