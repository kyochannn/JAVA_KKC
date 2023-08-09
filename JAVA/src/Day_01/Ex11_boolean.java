package Day_01;

import java.util.Scanner;

public class Ex11_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("전원 : ");
		
		boolean on = sc.nextBoolean();
				
		System.out.println("on:" + on);
			
		if(on) {
			System.out.println("전원on");
		}
		else {
			System.out.println("전원off:");
		}
		sc.close();	
		}
	}





/*
 * int a = 2; int b = 3; int c = ++a + b; System.out.println(c);
 * 
 * int e = 2; int f = 3; int d = e++ + f; System.out.println(d);
 */