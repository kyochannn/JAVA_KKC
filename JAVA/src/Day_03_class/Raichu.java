package Day_03_class;

// 상속
// - 키워드 : 자식 클래스 extends 부모클래스 {}

public class Raichu extends Pikachu {

	public Raichu() {
		super(200, "슈퍼전기", 20);
	}

	// 메소드 오버라이딩 : 메소드 재정의
	//alt + shift + s ----> v
	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String sAttack() {
		if (level >= 40);
			return "아이언테일";
		else
			return "(사용불가)";
	}
	
}
