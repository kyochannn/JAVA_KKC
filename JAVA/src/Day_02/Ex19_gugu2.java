package Day_02;

public class Ex19_gugu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단 * (1~9)
		// 단에 대한 반복 ; 1~9
		// 각 단에 곱 : 1~9

		// A * B
		// i : 단(A)
		for (int i = 1 ; i <= 9; i++) {
			
			
			for (int j= 1 ; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");		// 탭(공백)	
		}
			System.out.println();   // 한 단 끝 --> 다음 줄로 줄바꿈
		}
		
		
		
	}

}
