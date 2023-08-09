package Day_07.Ex01_Shape;

public class Triangle extends Shape {
	
	double width, height;

	// 생성자
	public Triangle() {
		this(0, 0);
	}
	
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// getter, setter
	@Override
	double area() {
		// 밑변 * 높이 / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// 정삼각형 : (한 변의 길이) * 3
		return width * 3;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
