package Day_02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// 4학년, 60점
		System.out.println("학년 : ");
		int year = sc.nextInt();
				
		System.out.println("점수 : ");
		int score = sc.nextInt();
				
		if (year == 4) {
			if (score >= 60) {
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}
		else {
				System.out.println("조건에 해당 없음.");
			// 조건문 안에 조건문(중첩 조건문)은 권장하지 않는다. 가독성이 떨어지기 때문에
		}
		
		// 중첩하지 않고 조건을 줄 수 있다.
			//조건1 합격!
			//4학년 이면서 점수가 60점 이상
			if(year == 4 && score >= 60) {
				System.out.println("합격!");
			}
			//조건2 불합격!
			//4학년 이면서 점수가 60점 미만
			else if(year == 4 && score < 60) {
				System.out.println("불합격!");
			}
			//조건3 응시자격없음
			//4학년이면서 점수가 60점 이상
			if(year == 4) {
				System.out.println("응시자격 없음");
			}
			

		sc.close();
	}
	}
