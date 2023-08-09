package Day_02;

import java.util.Scanner;

public class Ex10_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요");
		int channel = sc.nextInt();
		
		//switch : ctrl + space
		switch (channel) {
		case 11:
			System.out.println("mbc - 나혼자 산다");
			break;
		case 15:
			System.out.println("jtbc - 킹더랜드");
			break;
		case 27:
			System.out.println("Mnet");
			break;
		case 1:
			System.out.println("넷플릭스 - 하트시그널");
			break;
		case 2:
			System.out.println("디즈니플러스 - ");
			break;
		case 3:
			System.out.println("쿠팡플래이 - snl");
			break;
		default:
			System.out.println("유요한 채널 번호를 입력하세요!");
			break;
		}
		
		sc.close();
	}

}
