package 연습장;

public class 연습 {
	public static String delimiter = "";
	public static void main(String[] args) {
		
	delimiter = "------";
	printA();
	printA();
	printB();
	printB();
	
	delimiter = "******";
	printA();
	printA();
	printB();
	printB();
	}

	private static void printA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	private static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
