package Method;

public class LocalVariable {
	
	public static void main(String[] args) {
		boolean ste = true;
		int num1 = 11;
		
		if(ste) {
			//int num1 = 22; // 주석 해제하면 컴파일 오류 발생. C언어는 허용하지만 JAVA는 하용X
			num1++; // 7행의 num1 접근
			System.out.println(num1);
		}
		
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		} // num2 소멸
		
		//System.out.println(num2); // 주석 해제하면 컴파일 오류 발생
	}
}
