package 연습장;

// ? 인스턴스를 만들지 않고, 클래스를 호출하는 방법을 알고 싶었다.

class outClass{
	public static int sum(int a, int b) {  // 정적 메소드를 사용해서 
		int sum = a + b;
		return sum;
	}
}

public class SuperEx {
	int a;
	int b;
	int c;

	public SuperEx(){
		this.a = 1;
		this.b = 3;
	}
	

	
	public static void main(String[] args) {
		SuperKk j = new SuperKk();
		System.out.println(j.a);
		System.out.println(j.b);
		System.out.println(j.c);
		
		System.out.println("내가 알아보고 싶은 것 : " 
				+ outClass.sum(2, 6)); 		 
		// 이렇게 해주면 클래스에 직접 접근할 수 있다.
	}
}

class SuperKk extends SuperEx{
	public SuperKk() {
		super();     // 부보의 생성자를 호출할 때
		this.a = 8;  // 오버라이딩
		this.c = 5;	
	}
}

// 궁금했던 점이 인스턴스로 불러오는 방법이 아닌 클래스로 불러오는 방법을 알고 싶었다.
