package Day_02;

public class Ex03_LogicalOperator {

	public static void main(String[] args) {
		
		//논리 연산자
		
		// AND (&&)
		// A and B : a와 b가 모두 참일 때
		// A B 결과 
		//---------
		// F F F
		// T F F
		// F T F
		// T T T
		System.out.println(true && true);
		System.out.println(true && false);
		
		// OR(||)
		// A or B
		// A B 결과
		//---------
		// F F F
		// T F T
		// F T T
		// T T T
		System.out.println(true || true);   // 경고가 뜨는 이유 : 쇼트 서킷!!
		System.out.println(true || false);
		System.out.println(true || (100 < 50));
		System.out.println((5 < 20) || (5 > 2));
		System.out.println();
		
		//XOR(^)
		// A XOR B : A와 B가 다를 때
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println((9 >= 2) ^ (7 > 4));
		System.out.println();
		
		// NOT(!)
		// !A : A true이면 false, false이면 true
		int value1 = 3;
		System.out.println(false && ++value1 > 10);   // 쇼트 서킷!
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 5);
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(false & ++value3 > 10);   // 쇼트 서킷x : 비트연산자의 경우에는 쇼트서킷이 적용이 되지 않는다.
		System.out.println(value3);							//*******쇼트서킷이 왜 적용이 되지 않는가?
		
		int value4 = 4;
		System.out.println(true | ++value4 > 5);
		System.out.println(value4);
	}

}
