package Method;

public class Q5 {
	
	public static void main(String[] args) {
		System.out.println("2^n :" + square(4));
	}
	public static int square(int n) {
		if(n==1)
			return 2;
		else
			return 2 * square(n-1);
			
	}
}
