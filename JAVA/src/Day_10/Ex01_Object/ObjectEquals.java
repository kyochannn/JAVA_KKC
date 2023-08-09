package Day_10.Ex01_Object;

import Day_10.Ex02_Object.Student;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}

public class ObjectEquals {

	public static void main(String[] args) {
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");
		
		if(student == student2)
			System.out.println("student와 student2의 주소가 같습니다.");
		else 
			System.out.println("sutdent와 student2의 주소가 다릅니다.");
		
		if(student.equals(student2))
			System.out.println("student와 student2는 같습니다.");
		else 
			System.out.println("sutdent와 student2는 다릅니다.");
		
		// --------------------------
		
		if(student == student3)
			System.out.println("student와 student3의 주소가 같습니다.");
		else 
			System.out.println("sutdent와 student3의 주소가 다릅니다.");
		
		if(student.equals(student3))
			System.out.println("student와 student3는 같습니다.");
		else 
			System.out.println("sutdent와 student3는 다릅니다.");
	}
}
