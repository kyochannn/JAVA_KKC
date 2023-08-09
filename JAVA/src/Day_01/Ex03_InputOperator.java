package Day_01;

import java.util.Scanner;

public class Ex03_InputOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("x : ");
		int x = sc.nextInt();
		
		System.out.println("y : ");
		int y = sc.nextInt();
		
		System.out.println("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		int avg = sum/3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg 평균 변수가 정수형(Int)이라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용해야한다.
		sc.close();

	}

}
