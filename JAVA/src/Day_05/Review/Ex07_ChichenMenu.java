package Day_05.Review;

import java.util.Scanner;

import Day_02.Ex20_continue;

/*
 * ########## 메뉴판 ###########
 * 1. 굽네치킨 - 볼케이노 치킨
 * 2. BBQ - 황금 올리브 치킨
 * 3. 교촌치킨 - 호니콤보 치킨
 * 4. BHC - 뿌링클 치킨
 * 5. 레드락 치킨 - 양념 치킨
 * 0. 종료
 * ############ 입력 : 
 * 
 * 메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
 * "(해당메뉴) 이 주문되었습니다." 라고 출력하시오.
 * 0을 입력하기 전까지 반복하고,
 * 0을 입력하면 반복을 종료합니다.
 * 종료 시, "?개의 주문을 완료합니다."라고 출력합니다.
 */

/*
 * 메뉴 보여주기
 * 입력 받기
 * 
 * 출력하기
 */

public class Ex07_ChichenMenu {
	static int  menuNo;
	static String menuName = " ";
	
	// 접근지정자 (static) 반환타입 메소드명(매개변수) { }
	public static void showMenu() {
		int  menuNo;
		System.out.println("#### 메뉴판 #####");
		System.out.print("1. 굽네치킨 - 볼케이노 치킨  ");
		System.out.print("2. BBQ - 황금 올리브 치킨  ");
		System.out.print("3. 교촌치킨 - 호니콤보 치킨  ");
		System.out.print("4. BHC - 뿌링클 치킨  ");
		System.out.print("5. 레드락 치킨 - 양념 치킨  ");
		System.out.println("0. 종료  ");
		System.out.println("0부터 5까지의 값을 입력해주세요.");
		System.out.println();
	}
	
	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		for (int i = 1 ; true ; i++ ) {
			menuNo = sc.nextInt();
			
			switch (menuNo) {
				case 1: menuName = "굽네치킨 - 볼케이노 "; break;
				case 2: menuName = "BBQ - 황금 올리브 치킨"; break;
				case 3: menuName = "교촌치킨 - 호니콤보 치킨 "; break;
				case 4: menuName = "BHC - 뿌링클 치킨"; break;
				case 5: menuName = "레드락 치킨 - 양념 치킨"; break;
				case 0: menuName = "종료"; break;
				default: menuName = "다시 주문해 주세요."; break;
			}
			if (menuNo == 0) {
				System.out.println(i-1 + "개의 주문을 완료합니다.");
				break;
			} else {
				System.out.println(menuName+"치킨이 주문되었습니다.");
				continue;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		// 메뉴판 출력 기능을 메소드로 정의하기
		showMenu();
		// 메뉴판 선택 기능을 메소드로 정의하기
		printMenu();
	}
}

// ******************다시한번 볼 것**********************

