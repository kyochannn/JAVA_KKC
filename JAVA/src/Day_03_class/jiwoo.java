package Day_03_class;

public class jiwoo {
	
	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스타입 객체면 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		pikachu.energy = 100;
//		pikachu.type = "전기";
//		pikachu.level = 1;
		
		System.out.println("###### 피카츄 #######");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("레벨 : " + pikachu.level);
		System.out.println("공격 A : " + pikachu.aAttack());
		System.out.println("공격 B : " + pikachu.bAttack());
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "진화", 20);
		System.out.println("###### 피카츄LV.20) #######");
		System.out.println("에너지 : " + pikachu20.energy);
		System.out.println("타입 : " + pikachu20.type);
		System.out.println("레벨 : " + pikachu20.level);
		System.out.println("공격 A : " + pikachu20.aAttack());
		System.out.println("공격 B : " + pikachu20.bAttack());
		System.out.println();
		
		Raichu Raichu = new Raichu();
		System.out.println("###### 라이츄 #######");
		System.out.println("에너지 : " + Raichu.energy);
		System.out.println("타입 : " + Raichu.type);
		System.out.println("레벨 : " + Raichu.level);
		System.out.println("공격 A : " + Raichu.aAttack());
		System.out.println("공격 B : " + Raichu.bAttack());
		System.out.println();
		
		Raichu Raichu40 = new Raichu();
		System.out.println("###### 라이츄(LV.40) #######");
		System.out.println("에너지 : " + Raichu40.energy);
		System.out.println("타입 : " + Raichu40.type);
		System.out.println("레벨 : " + Raichu40.level);
		System.out.println("공격 A : " + Raichu40.aAttack());
		System.out.println("공격 B : " + Raichu40.bAttack());
		System.out.println();
	}
	

}
