package 연습장.TryChatch_230807;


class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }

public class ClassCast {
	
	// (부모 클래스)    (자식 클래스)
	// Animal     <--   Dog, Cat
	// Animal = Cat 으로 업캐스팅한 이후에
	// 다시 Animal 을 Dog 로 다운캐스팅할 수 없다
	// - Cat 을 Dog 로 타입 변환할 수 없다
	public static void changeToDog(Animal animal) {
		
		// 예외 메시지 : java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;
		} catch(ClassCastException e) {
			System.err.println("Cat 을 Dog 로 변환할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);
	}
	

}


