package Day_03_class.Ex01_sudent;

public class student {
	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기
	
	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 생성자
	// - 기본 생성자
	public student() {
		this("이름 없음",1,"00000000","없음");
	}

	// - 모든 매개변수를 포함하는 생성자
	public student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	// 메소드
	// - 공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다");
		// 반환타입이 void이면, reture를 생략해도 된다
	}
	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		
		double average = (double) (score1 + score2) / 2;        // ******* 형변환!!
			
		return average;
	}
	
}
