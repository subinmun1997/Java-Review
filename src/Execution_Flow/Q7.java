package Execution_Flow;

public class Q7 {
	
	public static void main(String[] args) {
		int sum = 0;
		int n = 1;
		
		while(n<=1000) {
			if((n%2==0) && (n%7==0)) {
				System.out.println(n);
				sum += n;
			}
			n++;
		}
		System.out.println("sum = " + sum);
	}
}
