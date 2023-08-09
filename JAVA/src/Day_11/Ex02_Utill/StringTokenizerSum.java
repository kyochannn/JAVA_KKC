package Day_11.Ex02_Utill;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {

	// "1,2,3,4,5"
	// "," 분리 --> 1 2 3 4 5 (String)
	// 토큰을 int 타입으로 전환하여 합계를 구해보자.
	public static void main(String[] args) {
		System.out.println("원하는 값을 \"1,2,3,4,5\"형태로 적어주세요.");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		StringTokenizer n = new StringTokenizer(num,",");
		
		int sum = 0;
		
		while (n.hasMoreElements()) {
			int k = Integer.parseInt(n.nextToken());
			sum += k;
		}
		System.out.println("sum : " + sum);
		
		sc.close();
		
	}
}
