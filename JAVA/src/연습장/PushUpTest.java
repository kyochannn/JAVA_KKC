package 연습장;

import java.util.Scanner;


/*
 * 순서도
 * 1. 입력 받음
 * 2. 요일을 입력 받으면 그 날의 루틴이 생성
 * 3. 
 */

public class PushUpTest {
	public static void main(String[] args) {
		// 1. input
		
		push.count();
		Scanner sc = new Scanner(System.in);
		
		String conSt; // 입력값을 받도록 설정
		while(conSt == "x") {
			conSt = sc.nextLine();
			
			switch (conSt) {
				case "일": conSt = "휴식 (그냥 쉬어라)"; break;
				case "월": conSt = "가슴, 등"; break;
				case "화": conSt = "어깨, 이두"; break;
				case "수": conSt = "하체"; break;
				case "목": conSt = "가슴, 등"; break;
				case "금": conSt = "어깨, 이두"; break;
				case "토": conSt = "하체"; break;
				default: conSt = "***"; break;
			}
			if (conSt == "x") {
				System.out.println("오늘 운동 안함");
				break;
			} else {
				System.out.println(conSt+"루틴을 실시합니다.");
				continue;
			}
		}
		
	}
	
}
