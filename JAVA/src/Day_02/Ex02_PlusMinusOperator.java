package Day_02;

public class Ex02_PlusMinusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c;
		
		// 증감연산자
		// ++a, a++
		// --a, a--
		
		// 전위 연산자 : 연산자 우선순위가 가장 높다,.
		c = ++a + b;
		System.out.println("c = " + c);  // 31
		System.out.println("a = " + a);  // 11
		
		int x = 10;
		int y = 20;
		int z;
		
		z = x++ + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		
		// 연산자의 우선순위를 주목할 것!!
	}

}
