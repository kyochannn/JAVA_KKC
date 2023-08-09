package 연습장;

public class Student {
		int studentID;
		String studentName;
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		
		//1. 첫번째 방법으로 클래스에 main()함수 추가하기
		public static void main(String[] args) {
			Student studentAhn = new Student();
			student.studentName = "구교찬";
			
			
			안녕
			
			System.out.println(studentAhn.studentName);
			System.out.println(studentAhn.getStudentName());
		}
	}


