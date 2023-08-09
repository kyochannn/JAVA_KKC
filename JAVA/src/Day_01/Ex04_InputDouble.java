package Day_01;

import java.util.Scanner;

public class Ex04_InputDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		double avg = (double)sum / 3;  //강제 형변환
		// (int) / (int) : (int)
		// (double) / (int) : (double)
		// - 서로 다른 자료형 연산시, 결과는 큰 자료형으로 반환된다.
		
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용해야한다.
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg 평균 변수가 정수형(Int)이라서 소수부분을 표현할 수 없다.
		sc.close();

	}

}
