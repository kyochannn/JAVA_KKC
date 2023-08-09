package Day_07.Ex03_Player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 매우 더 빨리 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 매우 더 빨리 높이 점프 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴 한 바퀴 쌉가능");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 고급");
	}

}
