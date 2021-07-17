package Execution_Flow;

public class Q10 {
	
	public static void main(String[] args) {
		int count = 0;
		int num;
		
		for(num=1;num<100;num++) {
			if(((num%5) != 0) || ((num%7) != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
