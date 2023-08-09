package 연습장.TryChatch_230807;

public class Recursive_1905 {
	public static int method(int n) {
		
		if (n == 0) {
			return 0;   
		} 

		return n = n + method(n-1);
	}
	public static void main(String[] args) {
		System.out.println(method(8));
	}
}
