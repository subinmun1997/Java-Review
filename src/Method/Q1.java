package Method;

public class Q1 {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		operation(i, j);
		operation(30, 40);
	}
	
	public static void operation(int a, int b) {
		System.out.println("����: " + (a+b));
		System.out.println("����: " + (a-b));
		System.out.println("����: " + (a*b));
		System.out.println("������(��): " + (a/b));
		System.out.println("������(������): " + (a%b));
	}
}
