package 연습장.TryChatch_230807;

public class TryTry {
	
	public static int sum() {
		return 10 + 0;
	}
	public static int mal() {
		return 10 * 9;
	}
	public static int div() {
		return 10 / 0;
	}
	
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(mal());
		// java.lang.ArithmeticException
		try{
			System.out.println(div());
		} catch (ArithmeticException e) {
			System.err.println("잘못된 함수를 입력하셨어요.");
		}
		// finally 블록 생략 가능
		finally {
			// 예외 발생과 무관하게 실행하는 문장
			// 주로 예외 처리와 관련된 문장을 작성
			System.out.println("메모리를 해제 합니다.");
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
