package Execution_Flow;

public class Q12 {
	
	public static void main(String[] args) {
		int dan = 2;
		int is;
		
		for(dan=2;dan<=8;dan+=2) {
			is = 1;
			for(is=1;is<=dan;is++) {
				System.out.println(dan + " x " + is + " = " + dan*is);
			}
			System.out.println("\n");
		}
	}
}
