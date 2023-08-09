package Day_02;

public class Ex15_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~20까지의 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하여라.
		
		
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while (a <= 20) {
			if (a % 2 == 1) {
				int jjack = a;	
				sum1 = sum1 + jjack;
				
			}
			else {
				int hol = a;
				sum2 = sum2 + hol;
				
			}
			a++;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		
	}

}
