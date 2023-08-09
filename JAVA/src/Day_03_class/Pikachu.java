package Day_03_class;

public class Pikachu {

		
		// 클래스 : 객체를 정의하는 설계도
		// 멤며 : 변수, 메소드
		
		// 변수
		public int energy;
		public String type;
		public int level;
		
		// 기본 생성자
		public Pikachu() { 
			this(100, "전기",1);  // 다른 생성자를 호출하는 메소드
//			this.energy = 100;
//			this.type = "전기";
//			this.level = 1;
		}
		
		// 생성자 자동완선
		//alt + shift + s --> o
		// 메소드(생성자) 오버로딩
		public Pikachu(int energy, String type, int level) {
			// this : 객체 자기 ///
			this.energy = energy;
			this.type = type;
			this.level = level;
		}

		
		// 메소드
		public String aAttack() {
			return "십만볼트";
		}
		public String bAttack() {
			return "전광석화";
		}
	}


