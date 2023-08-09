package Day_03;

public class Ex05_Arrays {

	public static void main(String[] args) {
		
		
		int arr[][] = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;


		// [1][2][3]
		// [4][5][6]
		
		// arr.length : 첫번째 차원 배열요소의 개수
		// arr[i].length : 두번째 차원 배열요소의 개수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		System.out.println();
		}	
		
		// 2차원 배열 선언 및 초기화
		int arr2[][] = {{1,2,3},{4,5,6}};
		
		for (int j = 0; j < arr2.length; j++) {
			for (int j2 = 0; j2 < arr2[1].length; j2++) {
				System.out.print(arr2[j][j2]+" ");
			}
			System.out.println();
		}
			
		//*****************************
			
			
			
			
			
			
		
		
		
		
		
		
		
	}

}
