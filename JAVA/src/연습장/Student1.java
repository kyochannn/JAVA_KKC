package 연습장;

public class Student1 {

	// 일단 클래스를 만들기 위해 뭐가 필요할지 생각해보자.
	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기
	
	// 변수를 지정해 주자. 이를 맴버변수라고 한다.
	String name;
	int age;
	String stdNo;
	String major;
	
	// 그리고 생성자를 생성해준다. 생성자는 자동완성으로 만들 수 있다.
	// 생성자는 아래와 같은 디폴트 생성자가 있고,
	public Student1() {
	}
	// 매개변수를 받을 수 있는 생성자가 있다.
	public Student1(String name, int age, String stdNo, String major) {		this.name = name;
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	// 이제 기능을 정리해 보자.
	// 기능은 메소드을 적는 곳에 적어준다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// 반환타입이 void이면, return을 생략해도 된다.
	}
	
	// 아래의 메소드는 인자를 두개를 받아 합계를 통해 평균을 구하는 메소드이다.
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		// 평균을 구해보면 다음과 같다.
		average = (double) (score1 + score2)/2;
		return average;
	}

	// 다음으로는 메소드 오버로딩을 통해 인자를 다르게 하여 메소드를 하나 더 만든다.
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3)/3;
		return average;
	}
	
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
		// 평균을 구한다.
		for (int score : scores) {
			// 합계
			sum += score;
		}
		// 평균
		average = (double) sum / scores.length;
		return average;
	}
	
}
