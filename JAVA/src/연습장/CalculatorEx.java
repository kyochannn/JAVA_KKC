package 연습장;

import java.util.Scanner;

public class CalculatorEx {
	public static void arrAboutSum(){
		//---------------------------알고싶었던 것------
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Double x = 0.0;
		Double y = 0.0;
		
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 덧셈, 2. 뺄셈, 3. 곰셈, 4. 나눗셈, 5. 나머지 나옴");
		System.out.println("원하시는 계산을 선택하세요. : ");
		int calNum = sc.nextInt();
		if (calNum <= 2) {
			System.out.print("정수를 하나 입력하시오 : ");
			a = sc.nextInt();
			System.out.print("두번째 정수를 하나 입력하시오 : ");
			b = sc.nextInt();
		} else if (calNum <= 5) {
			System.out.print("실수를 하나 입력하시오 : ");
			x = sc.nextDouble();
			System.out.print("두번째 실수를 하나 입력하시오 : ");
			y = sc.nextDouble();
		} else if (calNum == 6) {
			System.out.print("어떤 수들의 합을 구할까요? : ");
			arrAboutSum();
		} else if (calNum <= 7) {
			System.out.print("어떤 수들의 평균을 구할까요? : ");
		}
		
		switch (calNum) {
		case 1:
			calculator.plus(a, b);
			System.out.println("더했음 : " + calculator.plus(a, b));
			break;
		case 2:
			calculator.minus(a, b);
			System.out.println("뺌 : " + calculator.minus(a, b));
			break;
		case 3:
			calculator.multiple(x, y);
			System.out.println("곱 : " + calculator.multiple(x, y));
			break;
		case 4:
			calculator.divide(x, y);
			System.out.println("나누기 : " + calculator.divide(x, y));
			break;
		case 5:
			calculator.remain(x, y);
			System.out.println("나머지가 있는 나누기 : " + calculator.remain(x, y));
			break;
		case 6:
			calculator.sum(arr[])
		default:
			break;
		}
		
		

		
		
	}
}
