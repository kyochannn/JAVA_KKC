package 연습장;

	/*
	 * 계산기
	 * - 피연산자르 2개로 하는 계산기
	 * - 기능
	 * 		1. 덧셈   : 정수 2개 
	 * 		2. 뺄셈   : 정수 인자1 - 인자2 연산하는 뺄셈
	 * 	 	3. 곱셈   : 실수 2개
	 * 		4. 나눗셈  : 실수 인자1 / 인자2
	 * 	 	5. 나버지  : 실수1 % 인자2
	 * 		6. 합계   : 배열을 매개변수로 전달받아서 모든요소의 합을 구함
	 * 	 	7. 평균   : 배열을 매개변수로 전달받아서 모든요소의 평균을 구함.
	 */
public class Calculator {
	
	// 메소드명 : plus, minus, multiple, divide, remain, sum, avg
	// 덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	// -
	public double minus(double a, double b) {
		double result = a - b;
		return result;
	}
	// *
	public Double multiple(Double x, Double y) {
		Double result = x * y;
		return result;
	}
	// /
	public Double divide(Double x, Double y) {
		Double result = x / y;
		return result;
	}
	// %
	public Double remain(Double x, Double y) {
		Double result = x % y;
		return result;
	}
	// sum
	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	// average
	public int average(int[] arr) {
		int sum = sum(arr);
		int average = sum / arr.length;
		return average;
	}
}