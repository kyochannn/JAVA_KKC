package Day_11.Ex01_Lang;

public class MathEx {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);  // 3.141592653589793
		System.out.println(Math.ceil(3.125));  // 올림 : 해당 수보다 큰 정수 중 가장 작은 수
		System.out.println(Math.floor(3.725));  // 내림 : 해당 수보다 큰 정수 중 가장 큰 수
		System.out.println(Math.sqrt(9)); // 제곱근(루트)
		System.out.println(Math.exp(2));  // e의 2승
		System.out.println(Math.round(3.14));  // 반올림
		
		System.out.println("---------------------------");
		

		// 로또 번호 6/45
		// [1, 45] 사이의 정수형 난수 6개 만들기
		// Math.random()  					: 0.0보다 크거나 같고 1.0보다 작은 임의의 실수
		// Math.random()  					: 0.xxx ~ 9.xxx (0~9) - 10개
		// (0.xxx ~ 0.9xx) * 10				: 0.xxx ~ 19.xxx  (0~19) - 20개
		// (0.xxx ~ 0.9xx) * 45 			: 0.xxx ~ 44.xxx
		// (0.xxx ~ 0.9xx) * 45 + 1 		: 1.xxx ~ 45.xxx
		// (int)(Math.random()) * 45 + 1 	: 1 ~ 45
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45 + 1);
			System.out.print(random + " ");
		}
		System.out.println();
		
		// -50에서 50 사이의 랜덤 정수 1개 출력하기
		int random = (int)(Math.random() * 101 - 50);
		System.out.println(random);
		
		// [공식]
		// (int)(Math.random() * [개수] + [시작개수])
		
		
		
		double arr[] = {89.45, 64.55, 65.65, 36.56, 70.23};
		
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

		
		System.out.println("max : " + max);
	}
}
