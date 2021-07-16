package Operators;

public class Q5 {
	
	public static void main(String[] args) {
		int n1,n2,n3;
		boolean result;
		n1 = ((25+5) + (36/4) -72) * 5;
		n2 = ((25*5) + (36-4) + 71) / 4;
		n3 = (128/4) * 2;
		
		result = (n1>n2) && (n2>n3);
		if(result) 
			System.out.println("True");
		else
			System.out.println("False");
	}
}
