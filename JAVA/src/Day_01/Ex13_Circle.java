package Day_01;

import java.util.Scanner;

public class Ex13_Circle {
	public static void main(String[] args) {
		//상수
		// 프로그램 실행동안 값을 변경하지 않고 사용할 값
		// * 상수 선선시, 반드시 값을 초기화해야한다
		// * 선언후에 값을 변경하면 에러가 발생한다
		//  - 키워드 : finla
		
		final double PI = 3.141592;
		PI = 3.14;  // 상수는 값을 바꾸면 에러 발생/값을 바꿀 수 없다
		Scanner sc = new Scanner(System.in);   //shift + enter : 바로 다음줄로 감
		
		double radius = sc.nextDouble();
		double erea = PI * radius * radius;
		
		System.out.print("원의 넓이 :" + erea);
		sc.close();
		*************
	}
}
