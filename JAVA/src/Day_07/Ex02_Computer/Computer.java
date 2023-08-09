package Day_07.Ex02_Computer;

// 추상클래스
public abstract class Computer {
	// 추상메소드
	public abstract void display();
	public abstract  void typing();
	
	// 추상메소드를 정의하면, abstract 키워드를 붙여주어야한다.
	// 추상메소드를 정의하면, 클래스도 추상 클래스로 정의해야한다.	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
