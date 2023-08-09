package Day_05.Ex01_StaticMenber.copy;

public class StaticMenber {
	
	// static 변수
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	// static 메소드
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
		//sum += c;   // static변수로 만들어 주지 않았기 때문에 오류가 난다.
		return sum;
	}
	public static void main(String[] args) {
		int sum = sum(10, 20);
		a = 100;   
		
		StaticMenber sm1 = new StaticMenber();
		StaticMenber sm2 = new StaticMenber();
		
		int a1 = sm1.a;                 //static int a; 에 100이 들어감
		int b1 = sm1.c = 10;
		int a2 = sm1.a = a;             //static int a; 에 100이 들어감  >>  정적변수로 선언했기 때문에 각각의 인스턴스에서 공유한다.
		int c2 = sm1.c = 20;
				
		PI = 100;  
		// 상수이기 때문에 변경을 해줄 수 없다.
		// final은 상수로 지정하는 키워드
		// : 값을 한 번 넣으면 초기화 한 이후에는 값을 변경할 수 없다.
		
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
		System.out.println("a1 : " + a1);
		System.out.println("c1 : " + c1);
	}
	
}
