package Day_05.Ex01_StaticMenber.copy;

/*
 * 싱글톤 패턴
 * - 디자인패턴 중의 하나로 프로그램이 시잘될 때 최초로 한 번만 할당해서 인스턴스를 사용하는 패턴
 * - 객체가 필요할 때 , 새로운 객체를 생성하지 않고 기존의 인스턴스를 활용하는 코드의 패턴
 * - 객체가 하나만 생성하기 떄문에 메모리르 ㄹ효율적으로 사용할 수 있다.
 * 
 * - 진짜 패턴 중에 하나네. 틀과 같음. 나중에 이 기능으 ㄹ쓸 때 이걸 가져와서 쓰면 됨.
 */
public class SingleTon {
	// static 으로 유일한 객체를 생성
	private static SingleTon instance = new SingleTon();
	
	// 생성자를 private으로 정의________________여기가 가장 중요함.
	private SingleTon() {
	
	}
	
	// 유일한 객체를 반환하는 메소드
	// 이걸로 가져올 수 있다.
	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();	
	}  // 혹시라도 instance가 비어있으면 새로운 인스턴스를 만들어라.
	return instance;
	   // 
	}
}

	// 블록안에서 변수는 한번만 자료형을 설정해 주면 된다.
