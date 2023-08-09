package Day_03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {

		// 첫째 줄에 입력할 개수 N을 입력하고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으세요
		// N개의 정수 중 최솟값을 구하여 출력하시오.
		// (입력 예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 최솟값 : 100
		/*
		 * (순서도)
		 * 1. 정수 하나를 입력받음
		 * 2. 입력받은 정수를 변수 N에 대입한다.
		 * 3. N번 반복하여 N개의 정수를 입력받는다
		 * 4. 입력받은 N개의 정수를 배열 arr에 저장한다.
		 * 5. 배열 arr를 반복하여, min와 i번째 요소를 비교한다
		 * 6. 두 요소 중 더 큰 요소를 변수 min에 대입한다
		 * 7. 반복이 끝나고, 변수 min를 출력한다. 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < args.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;    // int 타입의 최솟값 : -21억 xxxx
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		} 
		
		System.out.println("min : " + min);
		sc.close();
		
		
		
		//***********************************
		
		
		
		
		
		
		
		

		
		
	}

}
