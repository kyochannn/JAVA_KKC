package Day_02;

public class Ex14_WhileSum {

	public static void main(String[] args) {

		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+4+...+100까지의 합계를 구하시오.
		int a = 1;
		int sum = 0;
		
		while (a <= 100) {   // whele문에서 조건식 ()뒤에 ;을 적지 않을 것!!!
//			sum = sum + a;
//			a = a + 1;  이 둘줄짜리 코드를 아래와 같이 간단하게 입력할 수 있다.
			sum += a++;
		}
		System.out.println("합계 : " + sum);
	}

}
