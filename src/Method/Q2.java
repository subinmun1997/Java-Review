package Method;

public class Q2 {
	
	public static void main(String[] args) {
		absolute(10,20);
		absolute(20,10);
	}
	public static void absolute(int a, int b) {
		if(a<b)
			System.out.println("����: " + (b-a));
		else
			System.out.println("����: " + (a-b));
				
	}
}
