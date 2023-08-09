package Day_05.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
		// 정수 1~ 100까지 반복하면서,
		// 해당 수가 3 또는 6또는 9일 때,
		// 369가 되는 만틈 "*"을 출력하는 프로그램을 작성하시오.
		// 33 >> **, 9 >> *
		
		
		// ****************************이 방법 다시 한번 살펴볼 것************************************
		// 아래의 코드를 변수를 사용하여 가독성있게 만드는 법에 초점을 맞출 것
		
		for (int i=1; i<=100; i++) {
						
			if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9 ) && (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)) {
				System.out.println("**");
			}
			
			else if ((i / 10 == 3 || i / 10 == 6 || i / 10 == 9) || (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)){
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
