package Day_07.Ex02_Computer;

public class User {
	public static void main(String[] args) {
		
		Computer computer = new DeskTop();
		// Computer computer2 = new LapTop();       
		// 추상클래스는 객체로 생성할 수 없다.
		
		Computer computer2 = new Gram();	
		LapTop lapTop = new Gram();
		Gram gram = new Gram();
		
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnOff();
		
		computer2.turnOn();
		computer2.display();
		computer2.typing();
		computer2.turnOff();
		
		lapTop.turnOn();
		lapTop.display();
		lapTop.typing();
		lapTop.turnOff();
		
		gram.turnOn();
		gram.display();
		gram.typing();
		gram.turnOff();
	}
}
