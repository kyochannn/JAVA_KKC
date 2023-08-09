package Day_03_class.Ex01_sudent;

public class studentEx {
	public static void main(String[] args) {
		//student 객체 생성
		student student = new student();
		student.name = "김조은";
		student.age = 20;
		student.stdNo = "20240001";
		student.major = "영상디자인과";
		
		// student2 객체 생성
		student student2 = new student("이용성", 20, "20240002", "컴퓨터 공학");
		
		System.out.println("##### 학생1 #####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - 유튜브 편집 실습");
		student.study("유튜브 편짐 실습");
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
	}
}
