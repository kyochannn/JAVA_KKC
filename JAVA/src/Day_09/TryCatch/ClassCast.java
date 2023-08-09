package Day_09.TryCatch;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class ClassCast {
	
	// (부모 클래스)   (자식 클래스)
	// Animal <---- Dog, CAt
	// Animal = cat으로 업캐스팅한 이후에
	// 다시 Animal을 Dog로 다운캐스팅할 수 없다.
	// - Cat을 Dog로 타입 변환을 할 수 없다.
	
	// - 이때를 예외처리를 해보자
	public static void changeToDog(Animal animal) {
		
		// 예외 메시지 : java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;
		} catch (Exception e) {
			System.out.println("Cat을 Dog로 변환할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);
	}
}
