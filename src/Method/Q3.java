package Method;

public class Q3 {
	
	public static void main(String[] args) {
		double rad = 10;
		System.out.println("���� ����: " + area(rad));
		System.out.println("���� �ѷ�: " + circum(rad));
	}
	
	public static double area(double rad) {
		return 3.14 * rad * rad;
	}
	
	public static double circum(double rad) {
		return 2 * 3.14 * rad;
	}
}
