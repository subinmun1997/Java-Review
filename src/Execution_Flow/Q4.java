package Execution_Flow;

public class Q4 {
	
	public static void main(String[] args) {
		int n = 24;
		n /= 10;
		
		switch(n) {
		
		case 0:
			System.out.println("0 이상 10미만의 수");
			break;
		case 1:
			System.out.println("10 이상 20미만의 수");
			break;
		case 2:
			System.out.println("20 이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
		}
		
	}
}
