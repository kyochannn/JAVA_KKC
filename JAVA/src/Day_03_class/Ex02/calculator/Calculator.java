package Day_03_class.Ex02.calculator;

public class Calculator {

//계산기
//- 피연산자를 2개로 하는 계산기
//- 기능 
//	1. 덧셈 : 정수 2개를 덧
//	2. 뺄셈 : 정수 인자1개 - 인자2 연산하는 뺄셈
//	3. 곱셈 : 실수 2개를 곱셈
//	4. 나눗셈 : 실수 인자1개 / 인자2 연산하는 나눗셈
//	5. 나머지 : 실수 인자1 % 인자2 연산하는 나눗셈
//	6. 합계 : 배열을 매개변수로 전달받아, 모든 요소의 합을 구함
//	7. 합계 : 배열을 매개변수로 전달받아, 모든 요소의 평균을 구함

			
	
	// 덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 뺄셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	// 곱셈 (**)
	public double munitple(double a, double b) {
		double result = a * b;
		return result;
	}
	
	// 나눗셈 (**)
	public double divide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	// 합계 (**)
	public int sum(int arr[]) {
//		int sum = 0;
//		for (int i = 1; i < Arr.length ; i++) {
//			sum += i;
//			return sum;
//	}
	
		int sum = 0;
		for (int i : arr) 
			sum += i;
		}
	
	
	// 평균 (다시 살펴볼 것)
	public int sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
	}
	
	public double avg(int[] arr) {
		int sum = avg(avg);
		double avg = (double) sum / arr.length;
		return avg;
	}

	
}




// 자료형, 형변환 공부 필요






