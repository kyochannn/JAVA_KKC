package Day_05.Review;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		// 공식 : (int) (Math.random() * <개수> + <시작 문자>);
		// 공식 이해해보기
//		int random = (int) (Math.random() * 45 + 1);
//		
//		System.out.println("random : " + random);
//		
//		
//		
//		// 1 ~ 20 사이의 랜덤 수
//		int rand1 =  (int) (Math.random() * 20 + 1);
//		
//		System.out.println("random1 : " + rand1);
//		
//		// -20 ~ 20 사이의 랜덤 수
//		int rand2 =  (int) (Math.random() * 40 - 21);
//		System.out.println("random2 : " + rand2);
//		
		// 1 ~ 45 사이의 6개 랜덤 수를, 중복을 제거하고 오름차순으로 정렬
		int[] lotto = new int[6];
		for(int i=0; i < 6; i++) {
			int random = (int) (Math.random() * 45 + 1);
			lotto[i] = random;
			// 중복 제거
			for (int j=0; j<i; j++ ) {
				if(random == lotto[j])
					i--;
			}
		}
		
		// 오름차순 정렬(선택정렬)
		// 1. i번째 요소를 선택, 나머지 요소들과 비교
		// 2. (선택 요소) > (비교요소) -->> 교환
		
		for(int i = 0; i < lotto.length -1 ; j++) {
			for (int j=i+1;j <lotto.length; j++ ) {
				if(lotto[i] > lotto[j]) {
					// 자리를 변경할 때, 바로 변경을 해주면 값이 지워짐.
					// 그래서 지역변수에 임시로 넣어주고, 자리를 바꾸고
					// 지역 변수를 뒤로 돌려준다.
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		// _________________________학습 필요_________________________
		// 배열에 대한 이해 필요
		// 이중 for문
		// 정렬 - 선택정렬, 버블정렬, ... 완벽하게 숙지 하는게 아니라 이런식으로 되는구나 이정도만.(팀과제)
	}
}
