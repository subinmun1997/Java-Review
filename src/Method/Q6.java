package Method;

public class Q6 {
	
	public static void main(String[] args) {
		toBinary(10);
	}
	public static void toBinary(int decimal) {
		if(decimal > 0) {
			int bin = decimal % 2;
			decimal /= 2;
			
			toBinary(decimal);
			System.out.print(bin);
		}
	}
}
