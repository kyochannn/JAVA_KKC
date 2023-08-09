package 연습장;

import java.util.Scanner;

public class Car {
	String modelName;
	int modelYear;
	
	// 기본 생성자
	public Car() {
		this.modelName = "현대";
		this.modelYear = 2022;
	}
	
	// 생성자
	public Car(String modelName, int modelYear) {
		this.modelName = modelName;
		this.modelYear = modelYear;
	}
	
	// 메서드
	public static void carAct(String modelName) {
		System.out.println(modelName + "를 새로 구매하고 싶습니다.");
	}
	
class hopeCar extends Car{
	String modeName;
	int modelYear;
	Stirng when;
	String modelType;
	
	public hopeCar(String modelName, int modelYear
			, Stirng when, String modelType) {
		this.modelName = modelName;
		this.modelYear = modelYear;   // 이걸 오버라이딩이라고 하나?
		this.when = when;
		this.modelType = modelType;
	}
}
	
	
//	public static void carAct(String modelName, int modelYear) {
//		System.out.println(modelName + "를 새로 구매하고 싶습니다.");
//	}
	
	
	public static void main(String[] args) {
		
		System.out.print("당신의 자동차는 몇년식 인가요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		Car familyCar = new Car("일단 비워둠", year);
		System.out.println("우리 가족의 차는 " + familyCar.modelName + "은 생산년도가 " 
				+ familyCar.modelYear + "입니다.");
		
		Car myCar = new Car("bmw", year);
		System.out.println("나의 차인 " + myCar.modelName + "은 생산년도가 " 
				+ myCar.modelYear + "입니다.");

//		Car yourCar = new Car("benz", 2021);
//		System.out.println("친구의 차인 " + yourCar.modelName + "은 생산년도가 " 
//				+ yourCar.modelYear + "입니다.");
		
		carAct(myCar.modelName);
		if (myCar.modelYear > 2020) {
			System.out.println("차가 " + myCar.modelYear + "년형 이므로,");
			System.out.println("차를 새롭게 구매할 수 없습니다.");
			System.out.println("그럼 가족중에 어떤 차를 타고있나요?");
			
		} else {
			System.out.println("차가 " + myCar.modelYear + "년형 이므로,");
			System.out.println("차를 새롭게 구매할 수 있습니다.");
			System.out.println("어떤 차를 구매하시겠습니까?");
		}
		sc.close();
		
	}
}
