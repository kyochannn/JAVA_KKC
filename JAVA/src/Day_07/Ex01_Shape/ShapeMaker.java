package Day_07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null; //?
		double width = 0.0;
		double height = 0.0;
		double r = 0.0;
		
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while (true) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원");
			System.out.println(">>");
			String input = sc.next();
			
			if(input.equals("그만"))
				break;
			switch (input) {
				case "1":
					// 삼각형
					System.out.println("가로 >>");
					width = sc.nextDouble();
					System.out.println("세로 >>");
					height = sc.nextDouble();
					
					// shape > 추상클래스이자 부모클래스 , Triangle > "클래스이자 자식클래스
					shape = new Triangle(width, height);
					shapeList[index++] = shape;
					break;
					
				case "2":
					// 사각형
					System.out.println("가로 >>");
					width = sc.nextDouble();
					System.out.println("세로 >>");
					height = sc.nextDouble();
					
					shape = new Rectangle(width, height);      // ?!
					shapeList[index++] = shape;
					break;
					
				case "3":
					// 원
					System.out.println("반지름 >>");
					r = sc.nextDouble();
					
					shape = new Circle(r);
					shapeList[index++] = shape;
					break;
				}
		}
		
		for (Shape s : shapeList) {
			if (s == null )
				continue;
			
			// instanceof : 인스턴스를 비교하는 연산
			if(s instanceof Triangle)
				System.out.println("[삼각형]");
			if(s instanceof Rectangle)
				System.out.println("[사각형]");
			if(s instanceof Circle)
				System.out.println("[원형]");
			
			double area = s.area();
			double round = s.round();
			 
			areaSum = areaSum + area;
			roundSum = roundSum + round;
			
			System.out.println("넓이 : " + area + "\t");
			System.out.println("둘레 : " + round + "\t");
		}
		System.out.println("넓이의 총함 : " + areaSum);
		System.out.println("둘레의 총함 : " + roundSum);
		
		sc.close();
	}
}
