package Day_05.Ex01_StaticMenber.copy;

public class SingleTonTest {
	public static void main(String[] args) {
		
		// SingleTon s = new SingleTon(); 불가능하다.
		// 		>>> 왜냐하면 public class SingleTon{...}에서 생성자를 private으로 막았기 때문에
		
		SingleTon st01 = SingleTon.getInstance();
		SingleTon st02 = SingleTon.getInstance();
		
		// 인스턴스가 메모리 공간에 하나만 할당되어 있다.
		System.out.println(st01 == st02);
		// 객체를 생성해도 같은 결과를 확인할 수 있다.
		
	}
}
