package Execution_Flow;

public class ForInFor {
	
	public static void main(String[] args) {
		int i,j;
		for(i=0;i<3;i++) {
			System.out.println("---------------------------------");
			for(j=0;j<3;j++) {
				System.out.print ("[" + i + ", " + j + "]");
			}
			System.out.print("\n");
		}
	}
}
