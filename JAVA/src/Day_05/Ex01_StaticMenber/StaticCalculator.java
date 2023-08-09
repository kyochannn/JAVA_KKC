package Day_05.Ex01_StaticMenber;


class Calculator{
	public static int abs(int val) {   // static 메소드로 정의되어 있다는 것을 잘 인지하고,
		return val > 0 ? val : -val;
	}
	
	// *****다시 한번 볼 것
	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int a : arr) {
			if (max < a)
				max = a;
		}
		return max;
	}
	
	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int a : arr) {
			if(min > a)
				min = a;
		}
		return min;
	}
}

public class StaticCalculator {

	public static void main(String[] args) {
		
		int arr[] = {70,90,85,50,100};
		
		// 다른 클래스의 static메소드를 호출할 떄는
		// 클래스.메소드명(); 형태로 메소드를 호출한다.___________________________________!!!
		System.out.println("abs(-123 : " + Calculator.abs(-123));
		System.out.println("max(arr) : " + Calculator.max(arr));
		System.out.println("min(arr) : " + Calculator.min(arr));
	
	}
}
