package InformationHiding_Encapsulation;

class Point {
	int xPos, yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class Circles {
	
	int rad;
	Point center;
	
	public Circles(int x, int y, int r) {
		center = new Point(x, y);
		rad = r;
	}
	public void showCircleInfo() {
		System.out.println("rad: " + rad);
		center.showPointInfo();
	}
}

public class Q1 {
	
	public static void main(String[] args) {
		Circles c = new Circles(2,2,4);
		c.showCircleInfo();
	}
}
