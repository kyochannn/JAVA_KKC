package Day_07.Ex01_Shape;

public class Circle extends Shape {

	double r;
	 
	// 생성자
	public Circle() {
		this(0);
	}
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	double area() {   //?!
		return Math.PI * r * r;
	}
	
	@Override
	double round() {
		return 2 * Math.PI * r;
	}
	
	//게터세터
	public double getR() {
		return r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}


}
