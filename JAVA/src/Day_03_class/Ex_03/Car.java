package Day_03_class.Ex_03;

public class Car {
	// 모델명, 속도
	String model;
	int speed;
	public Car() {
	}
	// 생성자
	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	public Car(String model) {
		super();
		this.model = model;
	}
	
	//getter: 변수의 값을 가져오는 메소드
	//setter: 변수의 값을 지정하는 메소드
	//게터/세터 이름 : getName(), setName()
	//- get/set 뒤에 변수명을 첫글자를 대문자로해서 메소듬여 정의(관례)
	// 자동완성 : alt + shift + S --> R
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0)
			speed = 0;
		if(speed >= 300)
			speed = 300;
		
		this.speed = speed;
	}
	
	

}
