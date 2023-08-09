package Day_10.Ex03_Object;

class Human{
	protected String test(){
		return "test";
	}
}

class Student extends implements Cloneable{
	String name;
	Student(String name){
		this.name = name;
	}
}

public class ObjectDemo2 {

	public static void main(String[] args) {
		Student s1 = new Student("egoing");
		s1.test();
		// s1.clone(); 이렇게 바로 적으면 오류가 나오는데,
		// 그 이유는 Student클래스가 복재가능한 객체라는 사실을 자바가상머신에게 알려줘야한다.
		// 그걸 어떻게 알려주냐 Cloneable이라고 하는 인터페이스를 구현해 주면 된다.
		// class Student implements Cloneable 와 같은 형태로 알려주면 된다.
		// 그럼 Student클래스가 복재가능한 클래스라는 것을 알려주게 된다.
		
		// 이렇게 작성을 해줘도 s1.clone();는 오류가 발생하는데 그 이유는 
		// clone()의 접근 제어자는 protected이기 때문에 이 접근제어자의 특성상
		// 같은 패키지에 있거나 상속 받은 경우에만 접근이 가능하기 때문에 오류가 발생하는 것이다.
	}
}
