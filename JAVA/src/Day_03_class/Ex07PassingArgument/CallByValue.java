package Day_03_class.Ex07PassingArgument;

import java.security.PublicKey;

import Day_03_class.Pikachu;

public class CallByValue {
	
	public static void setArr(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			// 10 20 30 40 50
			arr[i] = (i+1) * 10; 
		}
		System.out.println("**** setArr메소드 ******");
		for (int i = 0; i <arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i] );
		}
		System.out.println();
	}
	
	public static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "불";
		System.out.println("***** setObjet메소드 *****");
		System.out.println(pikachu);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "전기";
		
		for (int i = 0; i<arr.length; i++) {
			
			arr[i] = i+1; 
		}
		System.out.println("***** main 메소드*****");
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i] );
		}
		System.out.println(pikachu);
		
		setArr(arr);
		setObject(pikachu);
		
		
		System.out.println("***** set 메소드 호출 후*****");
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i] );
		}
		System.out.println();
		
		
		
	}

	@Override
	public String toString() {
		return "CallByValue [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}	
}
