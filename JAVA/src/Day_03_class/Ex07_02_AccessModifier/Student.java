package Day_03_class.Ex07_02_AccessModifier;

import Day_03_class.Ex07_01_AccessModifier.Person;

public class Student extends Person {
	//상속!

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		
	}
	public void defaultSetting() {
		name = "x";
		height = 160;
		// age = 20;   // default라서 같은 패키지에서만 접근 가능
		// weight = 60;  // private이라서 해당 클래스에서만 접근 가능
		setAge(20);
		setWeight(60);
	}

}
