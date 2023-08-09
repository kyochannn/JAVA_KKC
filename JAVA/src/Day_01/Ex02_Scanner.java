package Day_01;

// 외부 클래스를 포함시키기
// import 패키지명.클래스명;
import java.util.Scanner;

public class Ex02_Scanner {

	public static void main(String[] args) {
		// 객체 생성 - new
		// 클래스 타입 캑체명 + new 클래스명();
		// 표준 입력 객체 - Scanner
		Scanner sc = new Scanner(System.in);   // Scanner 객체 생성 
		//ctrl + shift + o ==> import 단축키
		
		// (에러)   -  빨간색 밑줄 표시
		//  			프로그램이 실행 X
		// (경고)   -  노란색 밑줄 표시
		//  			프로그램이 실행 O   -  귄장
		
		System.out.print("a : ");
		int a = sc.nextInt();   // nextInt() : 정수 하나를 입력받는 메소드
		
		System.out.println("a : " + a);
		//"문자열": 문자열은 큰 따옴표로 표현한다.
		// 문자열과 숫자 연결하기
		// : "문자열"+변수(숫자)
		// - 문자열과 숫자를 + (연결 연산자)로 연결할 수 있다
		// 이 때, 숫자(int) 자료형이 문자열 자료형으로 변환되어 연결된다
		
		// close() : Scanner 객체를 메모리에서 해제하는 메소드
		sc.close();
		// Scanner 객체가 맏힌 후에는 입력을 할 수 없다.
	}

}
