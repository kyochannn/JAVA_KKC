package Day8.Ex01_UpDownCasting;

public class Person {
	
	//맴버변수
	String name;
	int age;
	
	// 생성자
	public Person() {
		this("이름 없음", 0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "일을 합니다";
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
