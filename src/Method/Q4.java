package Method;

public class Q4 {
	
	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++) {
			boolean result =  prime(i);
			if(result)
				System.out.println(i);
		}
	}
	
	public static boolean prime(int i) {
		int n;
		int count = 0;
		
		for(n=1;n<=i;n++) {
			if(i%n == 0)
				count += 1;
		}
		if(count<=2)
			return true;
		else
			return false;
	}
}
