package 연습장;

public class Student1Ex {

	public static void main(String[] args) {
		
		// 인스턴스를 만들었다.
		// 아래는 디폴트 생성자를 이용하여 인스턴스를 만들었고,
		Student1 kyochan = new Student1();
		kyochan.name = "구교찬";
		kyochan.age = 23;
		kyochan.stdNo = "20230724";
		kyochan.major = "computer";
		
		// 이 부분에서는 매개변수가 있는 생성자를 사용하여 인스턴스를 만들었다. 
		Student1 jisoo = new Student1("이지수", 24, "20191208", "art");

		// 중간고사 점수를 배열에 넣었다.
		int[] kyochanScore = {77, 80, 69, 44};
		int[] jisooScore = {99, 75, 89, 100};
		
		System.out.println("----- 구교찬의 정보 -----");
		System.out.println("구교찬은 현재 " + kyochan.age + "살 입니다.");
		kyochan.study("프로그래밍");
		System.out.println("구교찬의 국영수 평균 점수는 " + kyochan.getAverage(90, 60, 70));
		System.out.println("구교찬의 중간고사평균점수는 " + kyochan.getAverage(kyochanScore) + "점 입니다.");
		System.out.println();
		
		System.out.println("----- 이지수의 정보 -----");
		System.out.println("이지수의 현재 " + jisoo.age +"살 입니다.");
		jisoo.study("서양화");
		System.out.println("이지수의 국영수 평균 점수는 " + kyochan.getAverage(78, 100, 98));
		System.out.println("이지수의 중간고사평균점수는 " + jisoo.getAverage(jisooScore) + "점 입니다.");
	}
}
