package Class_Instance;

class Triangle {
	
	int bottom;
	int height;
	
	public Triangle(int bo, int he) {
		bottom = bo;
		height = he;
	}
	
	public void setBottom(int bo) {
		bottom = bo;
	}
	
	public void setHeight(int he) {
		height = he;
	}
	
	public int area() {
		return bottom * height / 2;
	}
	
}

public class Q1 {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(2,10);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: " + triangle.area());
		
		triangle.setBottom(10);
		triangle.setHeight(20);
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: " + triangle.area());
	}
}
