package Day_03_class.Ex07_01_AccessModifier;

public class Person {
	// 이름 키 나이 체중
	public String name;
	protected int height;
	int age;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}  // getter, setter
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", weight=" + weight + "]";
	}  //tostring
	
	public Person() {
		super();
	}  // 생성자 - 
	
	public Person(String name, int height, int age, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}  // 매개변수 생성자
	

	
//	// 생성자  어케 만드는거임????
//	
//	
//	// 매개변수 생성자  어케 만드는거임????
	 //ctrl shift + s   = >  o
	//  getter, setter
	
	// toString
	
	
	
	/*
	 * 매개변수 생성자  >>>   ctrl shift + s   = >  o
	 * 
	 * 생성자 
	 * 
	 * getter, setter (v)
	 * 
	 * toString (v)
	 * 
	 * - 살펴보기
	 */
			
			

}



