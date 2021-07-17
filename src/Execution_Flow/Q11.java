package Execution_Flow;

public class Q11 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1;;i+=2) {
			sum += i;
			if(sum >= 1000) {
				break;
			}
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
