package Execution_Flow;

public class Q13 {
	
	public static void main(String[] args) {
		int i, j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				if((10*i + 10*j) + (i+j) == 99)
					System.out.println("i , j = " + i + j);
			}
		}
	}
}
