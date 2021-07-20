package Method;

public class Q1 {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		operation(i, j);
		operation(30, 40);
	}
	
	public static void operation(int a, int b) {
		System.out.println("µ¡¼À: " + (a+b));
		System.out.println("»¬¼À: " + (a-b));
		System.out.println("°ö¼À: " + (a*b));
		System.out.println("³ª´°¼À(¸ò): " + (a/b));
		System.out.println("³ª´°¼À(³ª¸ÓÁö): " + (a%b));
	}
}
