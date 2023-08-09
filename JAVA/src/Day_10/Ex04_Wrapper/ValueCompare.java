package Day_10.Ex04_Wrapper;

public class ValueCompare {
	
	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		System.out.println("intObj1 == intObj2");
		System.out.println("결과 : " + (intObj1 == intObj2));
		
		//언박싱은 객체형을 기본형으로 바꿔줌.
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue()));
		
		// equals()  : 래퍼객체가 가진 내부의 값을 비교하는 클래스
		System.out.println("equlas() 메소드로 비교");
		System.out.println("결과 : " + intObj1.equals(intObj2));
		
		System.out.println("____________________________");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		// ==, != 기호로 래퍼객체를 비교하면
		// 아래의 범위에서는 내부의 값을 ==, != 기호로 바로 비교 가능
		// Boolean : true, false
		// 정수 타입 : - 128  ~  127
		// char : \u0000 ~ \u007f
		
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 : " + (intObj3 == intObj4));
		
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()));
				
		System.out.println("equlas() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
	}
}

		// 객체를 비교할 것이냐 객체안의 내부의 값을 비교할 것이냐
		// 기본형으로 비교흘 하면 eqauls()와 같은 함수를 사용하지 못한다.
		// 하지만 기본형을 Wrapper클래스로 바꿔주면 인스턴스를 통해 eqauls()와 같은 함수를 사용할 수 있다.
